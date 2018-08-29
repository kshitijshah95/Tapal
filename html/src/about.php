<?php

/**
 * help.php
 *
 * Displays help for the user
 *
 * @copyright 1999-2012 The SquirrelMail Project Team
 * @license http://opensource.org/licenses/gpl-license.php GNU Public License
 * @version $Id: help.php 14248 2012-01-02 00:18:17Z pdontthink $
 * @package squirrelmail
 */

/** This is the help page */
define('PAGE_NAME', 'about');

/**
 * Path for SquirrelMail required files.
 * @ignore
 */
define('SM_PATH','../');

/* SquirrelMail required files. */
require_once(SM_PATH . 'include/validate.php');
require_once(SM_PATH . 'functions/global.php');
require_once(SM_PATH . 'functions/display_messages.php');

displayPageHeader($color,"About");

echo "<html><body>";
echo html_tag( 'table style="width:80%;"',
        html_tag( 'tr style="width:80%;"',
            html_tag( 'td  style="width:80%;"','<div style="width:500px;text-align: center;"><b>' . _("About") .'</b></div>', 'center', $color[0] )
        ) ,
    'center', '', 'width="95%" cellpadding="1" cellspacing="2" border="0"' );
echo "<div style='padding:0px 50px 0px 50px;'>
<br/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
Our project, &#39TAPAL&#39 provides such a system that blends the modern day email facilities with an Indian touch for a homely environment. Our main aim was to provide organizations with their own TAPAL system for communicating amongst the employees, workers and whosoever concerned. It allows access to users validated only and only by the server. We can say that user creation is looked after only by the administrator operating the server. The server ought to be a Linux based platform. All user files are stored upon the server in the form of mail directories.
A lot of effort and thought has been linked with this project, not only did it open new windows for learning but aided us in understanding the need for project making and relationship building, i.e. soft skills.  
<br/>Our thought engraved with this project is,<br/>
<center> <i> <b>
Throwback to the olden time letters, the modern way...</b> </i> </center> </br>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
TAPAL, means &#39Letter&#39 in Gujarati (India).We give you the best of both times! A comforting look to sooth your Indian souls blended with full functionality of a modern day email service.
<br/> <br/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<br/>
We are the students of S.B.M. Polytechnic, who have put in efforts to create the modern email communication, thoughtfully named &#39TAPAL&#39.
<br/><br/><b>1280010 Mansi Deep Dandiwala</b><br>
     &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
     Handpicked colors, shades & added essence of India&#39s culture, just for you! 
<br/><br/><b>1280047 Kshitij Manish Shah</b><br>
     &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
     Using our skills in conjunction with our thoughts to provide you with a realistic modern day email experience.
<br/><br/><b>1280051 Ankit Purvesh Shah</b><br>
     &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
     Studying various mailing systems, in greater depth to give you the best! We strive to serve you better. 
<br/> <br/><center><pre><b>Contact Us</b>
Email: 2014tapal@gmail.com
Web: mail.tapal.com/squirrelmail</pre></center>
</div>"
?> </td>
<tr>
</table>
</body>
</html>