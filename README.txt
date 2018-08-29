---------------------------------------------------------------------------------------------------------------------------------------
                                                                                Welcome to TAPAL!
--------------------------------------------------------------------------------------------------------------------------------------- 
--------------------------------------------------------------------------------------------------------------------------------------- 


READ ME  

TAPAL provides four modules to work with 

--------------------------------------------------------------------------------------------------------------------------------------- 
[1] Email Client
--------------------------------------------------------------------------------------------------------------------------------------- 
-Email Client accessible at
	www.mail.tapal.com OR 
	192.168.42.148
From legitiamte users
Use Chrome or Safari for better view
Accessible within the LAN


-Steps for assigning IP to hostname 
(1)Open Terminal with administrative files

(2)Edit host file
For Ubuntu :	#nano /etc/hosts
For Windows:	#edit C:\Windows\System32\Drivers\etc\hosts
For Mac:		#nano /private/etc/hosts

(3)Make entry
	192.168.42.148	mail.tapal.com

(4)Save and Exit


--Location of  folder 'html'
Ubuntu Server:	/var/www

--Permissions for folder '/var/www' and within
Owner	admin_user
Group	root

--------------------------------------------------------------------------------------------------------------------------------------- 
[2] TAPALmngr
--------------------------------------------------------------------------------------------------------------------------------------- 
/* TAPALmngr is an application that allows the Administrator to manage instances, services of postfix, and user creation and deletion. */ 

-Prerequisites
Install gksu
(1) Open Terminal with root login
(2) Fire commands
	#apt-get install gksu
(3) Close Terminal


-Starting the application 
Double click the TAPALmngr application provided on your desktop.
	OR
Double click the TAPALmngr application from path /var/www/TAPALmngr

-Provisions
Start Psotfix service
Stop Postfix service
List instances
Create instance
Manage instances
List users
User creation
User deletion


Note: Output will be shown over the Terminal

--------------------------------------------------------------------------------------------------------------------------------------- 
[3] TAPALmail
--------------------------------------------------------------------------------------------------------------------------------------- 
/* TAPALmail allows you to send an email through sn application running on your machines */

-Starting the application 
Double click the TAPALmail application provided on your desktop.
	OR
Double click the TAPALmail application from path /var/www/TAPALmail

--------------------------------------------------------------------------------------------------------------------------------------- 
[4] TAPALmulti
--------------------------------------------------------------------------------------------------------------------------------------- 
/* TAPALmulti is the outcome of efforts directed towards achieving multi-threading while sending email.
On initiating this application 4 emails will be sent to statically defined emails after implementing multithreading. 
*/

-Starting the application 
Double click the TAPALmulti application provided on your desktop.
	OR
Double click the TAPALmulti application from path /var/www/TAPALmulti

--------------------------------------------------------------------------------------------------------------------------------------- 
--------------------------------------------------------------------------------------------------------------------------------------- 
					END
--------------------------------------------------------------------------------------------------------------------------------------- 