WarehouseStockViewer.jar

About:
This is a java application to simulate what an interface in a warehouse selling cheap CDs can be.

How to use:
Double click on WarehouseStockViewer.jar to run. 
This application uses a Windows Classic style, so it might only be able to run on Windows 
machines. 
All icons and XMLs are in /src, be sure to put it in the same directory as the main program.

Three menus will pop up. You can select one of them to log in, sign up or browse as guest. 
For login username and password, see details below. 
If you choose to log in, you can view your existing wish list, add some albums into your wish 
list or delete them. 
If you choose to sign up, you will get an empty wish list, other than that it's the same.
If you choose to browsw as guest, you won't have the wish list, but you can still browse 
through the collection.

Details:
Login information can be found in /src/XML/WishList.txt
Example: 
<?xml version="1.0" encoding="utf-8"?>
<a>
	<password>
		<pass>b</pass>
	</password>
</a>

So username is "a", password is "b".
You can modify this file if you like, but adding multiple title with same name is not sugg-
ested. It won't cause the program to crash, but it will cause confusion. 
There is a limit on the number of things in the wish list. It is defined in the source code 
as a global variable MAX_WISH (default 20). If you put more than MAX_WISH of titles, the program 
will only read the first MAX_WISH of them. 

The CD catalog will read fom /src/XML/CDcatalog.txt. 
All genre menu, artist menu and title menu will be presented in the order of this file. 
So if you want them to be in alphabetical order, you can sort this XML. Like the wish list, 
there are limits on the number of genres: MAX_GENRE (default 10), the number of artists 
per genre: MAX_ARTIST (default 10), and number of titles per artist: MAX_TITLE (default 10). 
They are all in the source code as well. 

