#!/bin/bash         

cd /var/www/TAPALmail/src
export CLASSPATH=$CLASSPATH:/var/www/mail.jar:.
javac MailUI.java
java MailUI
