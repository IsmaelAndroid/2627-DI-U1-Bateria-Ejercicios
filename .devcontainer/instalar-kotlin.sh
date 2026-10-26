#!/usr/bin/env bash
# Instala el compilador de Kotlin en el Codespace (solo se ejecuta al crearlo)
set -e
VERSION=2.1.0
cd /tmp
curl -sSL -o kotlinc.zip "https://github.com/JetBrains/kotlin/releases/download/v$VERSION/kotlin-compiler-$VERSION.zip"
sudo unzip -q -o kotlinc.zip -d /opt
sudo ln -sf /opt/kotlinc/bin/kotlinc /usr/local/bin/kotlinc
kotlinc -version
