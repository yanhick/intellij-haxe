
#build the intellij-haxe.jar file which can be
#installed in Intellij
default: parsers protocol
	./build.sh

#Build the Haxe and HXML parsers with GrammarKit,
#using their BNF
parsers:
	./build-parsers.sh

#Build the JavaProtocol.hx class into a Java class.
#This class is used to communicate with the CPP debbugger
#through socket
protocol:
	./build-haxe-protocol.sh

#Build and run the unit tests
test: parsers protocol
	./travis.sh
