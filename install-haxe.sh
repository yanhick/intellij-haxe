wget http://haxe.org/website-content/downloads/3,1,3/downloads/haxe-3.1.3-linux64.tar.gz
tar zxf haxe-3.1.3-linux64.tar.gz
mv haxe-3.1.3 haxe
haxe/haxelib setup haxe/haxelibdir
haxelib install hxjava
haxelib git debugger https://github.com/TiVo/debugger.git
