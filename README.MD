### WarehouseStockViewer

#### About:
This is a Java Swing application for use in a warehouse selling cheap CDs.

#### How to use:
Double click on WarehouseStockViewer.jar to run. 
This application uses Windows Classic style, so it might only be able to run on Windows 
machines. 
All icons and XMLs are in /src, make sure to put it in the same directory of the program.

In main menu there are three buttons, each for log in, sign up or browse as guest. 
For login username and password, see details below. 
If you choose to log in, you can view your existing wish list, add albums into your wish 
list or delete them. 
If you choose to sign up, you will get an empty wish list, other than that it's the same.
If you choose to browse as guest, you won't get a wish list, but you can still browse 
through the collection.

#### Details:
Login information can be found in /src/XML/WishList.txt.
The first item in this XML is the login credential.
For example:
<p>"<?xml version="1.0" encoding="utf-8"?>
<a>
	<password>
		<pass>b</pass>
	</password>
</a>"</p>

So default username is "a", password is "b".
You can modify this file to change the login credential or preset items in the wishlist. 
You can also manually add albums to the wishlist by modifying this file. 
Adding multiple items with the same name might cause confusion. 
The maximum number of items in the wishlist is defined in the source code 
as a global variable MAX_WISH (default 20). If you put more than MAX_WISH of items, the program 
will only read the first MAX_WISH of them. 

The CD catalog is in /src/XML/CDcatalog.txt. 
All genres, artists and titles will be displayed in the order of this file, 
So if you want them to be in alphabetical order, you can sort this XML. Like the wish list, 
there are limits on the number of genres: MAX_GENRE (default 10), the number of artists 
per genre: MAX_ARTIST (default 10), and number of titles per artist: MAX_TITLE (default 10).

