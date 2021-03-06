import sys, os, zipfile, yaml, shutil, subprocess

COMPILE_DIR = "out/production/Lukkit/"
LUAJ_ZIP = "libs/luaj-jse-3.0-beta2.jar"
LUAJ_TMP = "libs/luaj-jse"
SERVER_DIR = "sandbox/"

def main(args):
  pluginFile = open("src/plugin.yml", "r")
  plugin = yaml.load(pluginFile)
  name = plugin["name"]
  if len(args) < 2:
    version = plugin["version"]
  else:
    version = args[1]
  
  zip = zipfile.ZipFile("pkg/" + name + ".jar", "w")
  for root, dirs, files in os.walk(COMPILE_DIR):
    for file in files:
      if file != ".DS_Store":
        zip.write(os.path.join(root, file), os.path.join(root[len(COMPILE_DIR):], file))

  luaZip = zipfile.ZipFile(LUAJ_ZIP, "r")
  luaZip.extractall(LUAJ_TMP)

  for root, dirs, files in os.walk(LUAJ_TMP):
    for file in files:
      if file != ".DS_Store":
        zip.write(os.path.join(root, file), os.path.join(root[len(LUAJ_TMP):], file))

  shutil.rmtree(LUAJ_TMP)

  zip.close()
  
  if version == "test":
    shutil.copy("pkg/" + name + ".jar", SERVER_DIR + "plugins/")
    os.remove("pkg/" + name + ".jar")
    os.chdir(SERVER_DIR)
    subprocess.call("java -jar craftbukkit.jar", shell=True, stdin=sys.stdin, stdout=sys.stdout)
  else:
    os.rename("pkg/" + name + ".jar", "pkg/" + name + "-" + version + ".jar")

if __name__ == "__main__":
  main(sys.argv)
