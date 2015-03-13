#!/bin/bash

GrammarKitVersion="1.2.0"

if [ ! -d ./GrammarKit/ ]; then
    # Get our GrammarKit dependency
    if [ -f ~/Tools/GrammarKit-${GrammarKitVersion}.zip ];
    then
        cp ~/Tools/GrammarKit-${GrammarKitVersion}.zip . &&
        cp ~/Tools/light-psi-all-${GrammarKitVersion}.jar .
    else
        mkdir -p ~/Tools &&
        `wget -O GrammarKit-${GrammarKitVersion}.zip https://github.com/JetBrains/Grammar-Kit/releases/download/${GrammarKitVersion}/GrammarKit.zip`&&
        `wget -O light-psi-all-${GrammarKitVersion}.jar https://github.com/JetBrains/Grammar-Kit/releases/download/${GrammarKitVersion}/light-psi-all.jar` &&
        cp GrammarKit-${GrammarKitVersion}.zip ~/Tools/ &&
        cp light-psi-all-${GrammarKitVersion}.jar ~/Tools/
    fi

    # Unzip GrammarKit
    unzip GrammarKit-${GrammarKitVersion}.zip
    mv GrammarKit/lib/grammar-kit.jar .
    mv light-psi-all-${GrammarKitVersion}.jar light-psi-all.jar
fi

#Generate the haxe and hxml parsers
java -jar grammar-kit.jar gen ./grammar/haxe.bnf
java -jar grammar-kit.jar gen ./src/com/intellij/plugins/haxe/hxml/hxml.bnf

