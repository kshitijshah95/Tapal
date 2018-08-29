#!/bin/bash         

echo "Welcome to the TAPAL Manager."
cd /var/www/TAPALmngr/src
gksu javac mainTapal.java
gksu java mainTapal
