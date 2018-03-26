@echo off
setlocal
set PATH=%~dp0node_modules/;%PATH%
node node_modules/@angular/cli/bin/ng %*
@echo on
