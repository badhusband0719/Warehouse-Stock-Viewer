
package warehousestockviewer;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
// A CD object to store XML elements more efficiently
class CD {
    String Genre;
    String Artist;
    String Title;
    int number;
    // Default constructor
    public CD(String Genre, String Artist, String Title, int number) {
        this.Genre = Genre;
        this.Artist = Artist;
        this.Title = Title;
        this.number = number;
    }
}

public class MainMenu extends javax.swing.JFrame {

    // Global variables
    public int MAX_GENRE = 10;
    public int MAX_ARTIST = 10;
    public int MAX_TITLE = 10;
    public int MAX_WISH = 20;
    int WISH_LENGTH = 0;
    public CD[] WISH_LIST = new CD[MAX_WISH];
    
    public MainMenu () {
        // Set the title:
        // http://stackoverflow.com/questions/7510009/netbeans-how-to-put-some-title-in-the-title-bar
        this.setTitle("Warehouse Stock Viewer 1.0");
        // Setup the interface
        initComponents();
        // Initialze the interface
        initcondition();
    }
    
    // Initial visibility and usability setup
    public void initcondition(){
        // The scrollbar is very slow: 
        // http://stackoverflow.com/questions/5583495/how-do-i-speed-up-the-scroll-speed-in-a-jscrollpane-when-using-the-mouse-wheel
        genrelower.getVerticalScrollBar().setUnitIncrement(15);
        artistlower.getVerticalScrollBar().setUnitIncrement(15);
        titlelower.getVerticalScrollBar().setUnitIncrement(15);
        wishList.getVerticalScrollBar().setUnitIncrement(12);
        // Set all scrollbars to top: 
        // http://stackoverflow.com/questions/291115/java-swing-using-jscrollpane-and-having-it-scroll-back-to-top
        genrelower.getVerticalScrollBar().setValue(0);
        artistlower.getVerticalScrollBar().setValue(0);
        genrelower.getVerticalScrollBar().setValue(0);
        // Only show Main Menu first
        loginMenu.setVisible(false);
        signupMenu.setVisible(false);
        genreMenu.setVisible(false);
        artistMenu.setVisible(false);
        titleMenu.setVisible(false);
        addMenu.setVisible(false);
        wishList.setVisible(false);
        wlButton.setVisible(false);
        quitConfirm.setVisible(false);
        quitButton.setVisible(false);
        errorPane.setVisible(false);
        mainMenu.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgramFrame = new javax.swing.JLayeredPane();
        mainMenu = new javax.swing.JPanel();
        mainexit = new javax.swing.JButton();
        maintitle = new javax.swing.JLabel();
        mainlogin = new javax.swing.JButton();
        mainguest = new javax.swing.JButton();
        mainsign = new javax.swing.JButton();
        loginMenu = new javax.swing.JPanel();
        loginback = new javax.swing.JButton();
        logintitle = new javax.swing.JLabel();
        loginname = new javax.swing.JLabel();
        loginpass = new javax.swing.JLabel();
        loginnameentry = new javax.swing.JTextField();
        loginpassentry = new javax.swing.JPasswordField();
        loginsub = new javax.swing.JButton();
        loginpasserror = new javax.swing.JLabel();
        loginnameerror = new javax.swing.JLabel();
        signupMenu = new javax.swing.JPanel();
        signupback = new javax.swing.JButton();
        signuptitle = new javax.swing.JLabel();
        signupname = new javax.swing.JLabel();
        signuppass = new javax.swing.JLabel();
        signupnameentry = new javax.swing.JTextField();
        signuppassentry = new javax.swing.JPasswordField();
        signupsub = new javax.swing.JButton();
        signupnamenote = new javax.swing.JLabel();
        signuppassnote = new javax.swing.JLabel();
        signupnameerror = new javax.swing.JLabel();
        signuppasserror = new javax.swing.JLabel();
        quitConfirm = new javax.swing.JPanel();
        quittitle1 = new javax.swing.JLabel();
        quittitle2 = new javax.swing.JLabel();
        quityes = new javax.swing.JButton();
        quitno = new javax.swing.JButton();
        wishList = new javax.swing.JScrollPane();
        wlpane = new javax.swing.JPanel();
        wlButton = new javax.swing.JToggleButton();
        quitButton = new javax.swing.JButton();
        genreMenu = new javax.swing.JLayeredPane();
        genreupper = new javax.swing.JPanel();
        genretitle = new javax.swing.JLabel();
        genrelower = new javax.swing.JScrollPane();
        genrepane = new javax.swing.JPanel();
        artistMenu = new javax.swing.JLayeredPane();
        artistupper = new javax.swing.JPanel();
        artisttitle = new javax.swing.JLabel();
        artistback = new javax.swing.JButton();
        artistlower = new javax.swing.JScrollPane();
        artistpane = new javax.swing.JPanel();
        titleMenu = new javax.swing.JLayeredPane();
        titleupper = new javax.swing.JPanel();
        titletitle = new javax.swing.JLabel();
        titleback = new javax.swing.JButton();
        titlelower = new javax.swing.JScrollPane();
        titlepane = new javax.swing.JPanel();
        errorPane = new javax.swing.JPanel();
        errorTitle = new javax.swing.JLabel();
        errorSub = new javax.swing.JLabel();
        ErrorOK = new javax.swing.JButton();
        addMenu = new javax.swing.JPanel();
        addTitle = new javax.swing.JLabel();
        addArtist = new javax.swing.JLabel();
        addBack = new javax.swing.JButton();
        addDec1 = new javax.swing.JButton();
        addNumber = new javax.swing.JTextField();
        addInc1 = new javax.swing.JButton();
        addStock = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setName("loginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(null);

        ProgramFrame.setBackground(new java.awt.Color(51, 51, 51));
        ProgramFrame.setMaximumSize(new java.awt.Dimension(1280, 800));
        ProgramFrame.setMinimumSize(new java.awt.Dimension(1280, 800));
        ProgramFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainMenu.setBackground(new java.awt.Color(51, 51, 51));
        mainMenu.setMaximumSize(new java.awt.Dimension(1280, 800));
        mainMenu.setMinimumSize(new java.awt.Dimension(1280, 800));
        mainMenu.setPreferredSize(new java.awt.Dimension(1280, 800));
        mainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainexit.setBackground(new java.awt.Color(102, 102, 102));
        mainexit.setFont(new java.awt.Font("Cambria", 1, 28)); // NOI18N
        mainexit.setForeground(new java.awt.Color(255, 255, 255));
        mainexit.setText("Exit");
        mainexit.setAlignmentY(0.0F);
        mainexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainexitActionPerformed(evt);
            }
        });
        mainMenu.add(mainexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 675, 114, 55));

        maintitle.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        maintitle.setForeground(new java.awt.Color(255, 255, 255));
        maintitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maintitle.setText("Welcome to the Warehouse!");
        mainMenu.add(maintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1260, -1));

        mainlogin.setBackground(new java.awt.Color(255, 161, 0));
        mainlogin.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        mainlogin.setForeground(new java.awt.Color(255, 255, 255));
        mainlogin.setText("<html>Have an account?<br><br>Login</html>");
        mainlogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainlogin.setPreferredSize(new java.awt.Dimension(322, 318));
        mainlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainloginActionPerformed(evt);
            }
        });
        mainMenu.add(mainlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 250, -1, 314));

        mainguest.setBackground(new java.awt.Color(57, 144, 255));
        mainguest.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        mainguest.setForeground(new java.awt.Color(255, 255, 255));
        mainguest.setText("<html>Just browse as<br><br>Guest</html>");
        mainguest.setPreferredSize(new java.awt.Dimension(322, 318));
        mainguest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainguestActionPerformed(evt);
            }
        });
        mainMenu.add(mainguest, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 250, -1, 314));

        mainsign.setBackground(new java.awt.Color(185, 1, 185));
        mainsign.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        mainsign.setForeground(new java.awt.Color(255, 255, 255));
        mainsign.setText("<html>Don't have an account?<br><br>Sign up</html>");
        mainsign.setPreferredSize(new java.awt.Dimension(322, 318));
        mainsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainsignActionPerformed(evt);
            }
        });
        mainMenu.add(mainsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 250, -1, 314));

        ProgramFrame.add(mainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginMenu.setBackground(new java.awt.Color(51, 51, 51));
        loginMenu.setMaximumSize(new java.awt.Dimension(1280, 800));
        loginMenu.setMinimumSize(new java.awt.Dimension(1280, 800));
        loginMenu.setPreferredSize(new java.awt.Dimension(1280, 800));
        loginMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginback.setBackground(new java.awt.Color(102, 102, 102));
        loginback.setFont(new java.awt.Font("Cambria", 1, 28)); // NOI18N
        loginback.setForeground(new java.awt.Color(255, 255, 255));
        loginback.setText("Back");
        loginback.setAlignmentY(0.0F);
        loginback.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbackActionPerformed(evt);
            }
        });
        loginMenu.add(loginback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 675, 114, 55));

        logintitle.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        logintitle.setForeground(new java.awt.Color(255, 255, 255));
        logintitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logintitle.setText("Welcome to the Warehouse!");
        loginMenu.add(logintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1260, 73));

        loginname.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        loginname.setForeground(new java.awt.Color(255, 255, 255));
        loginname.setText("username:");
        loginMenu.add(loginname, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 270, 123, 45));

        loginpass.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        loginpass.setForeground(new java.awt.Color(255, 255, 255));
        loginpass.setText("password:");
        loginMenu.add(loginpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 380, 123, 45));

        loginnameentry.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        loginnameentry.setMargin(new java.awt.Insets(2, 8, 2, 2));
        loginnameentry.setMaximumSize(new java.awt.Dimension(339, 45));
        loginnameentry.setMinimumSize(new java.awt.Dimension(339, 45));
        loginnameentry.setPreferredSize(new java.awt.Dimension(339, 45));
        loginMenu.add(loginnameentry, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 270, 339, 45));

        loginpassentry.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        loginpassentry.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        loginpassentry.setToolTipText("");
        loginpassentry.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 8, 0, 0));
        loginpassentry.setMaximumSize(new java.awt.Dimension(339, 45));
        loginpassentry.setMinimumSize(new java.awt.Dimension(339, 45));
        loginMenu.add(loginpassentry, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 380, 339, 45));

        loginsub.setBackground(new java.awt.Color(255, 161, 0));
        loginsub.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        loginsub.setForeground(new java.awt.Color(255, 255, 255));
        loginsub.setText("Login");
        loginsub.setMaximumSize(new java.awt.Dimension(339, 45));
        loginsub.setMinimumSize(new java.awt.Dimension(339, 45));
        loginsub.setPreferredSize(new java.awt.Dimension(339, 45));
        loginsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginsubActionPerformed(evt);
            }
        });
        loginMenu.add(loginsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 478, 339, 55));

        loginpasserror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginpasserror.setForeground(new java.awt.Color(255, 51, 51));
        loginpasserror.setText(" ");
        loginMenu.add(loginpasserror, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 433, 339, -1));

        loginnameerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginnameerror.setForeground(new java.awt.Color(255, 51, 51));
        loginnameerror.setText(" ");
        loginMenu.add(loginnameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 322, 339, -1));

        ProgramFrame.add(loginMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        signupMenu.setBackground(new java.awt.Color(51, 51, 51));
        signupMenu.setMaximumSize(new java.awt.Dimension(1280, 800));
        signupMenu.setMinimumSize(new java.awt.Dimension(1280, 800));
        signupMenu.setPreferredSize(new java.awt.Dimension(1280, 800));
        signupMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signupback.setBackground(new java.awt.Color(102, 102, 102));
        signupback.setFont(new java.awt.Font("Cambria", 1, 28)); // NOI18N
        signupback.setForeground(new java.awt.Color(255, 255, 255));
        signupback.setText("Back");
        signupback.setAlignmentY(0.0F);
        signupback.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signupback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbackActionPerformed(evt);
            }
        });
        signupMenu.add(signupback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1123, 675, 114, 55));

        signuptitle.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        signuptitle.setForeground(new java.awt.Color(255, 255, 255));
        signuptitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signuptitle.setText("Welcome to the Warehouse!");
        signupMenu.add(signuptitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1260, -1));

        signupname.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        signupname.setForeground(new java.awt.Color(255, 255, 255));
        signupname.setText("username:");
        signupMenu.add(signupname, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 270, 123, 45));

        signuppass.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        signuppass.setForeground(new java.awt.Color(255, 255, 255));
        signuppass.setText("password:");
        signupMenu.add(signuppass, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 380, 123, 45));

        signupnameentry.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        signupnameentry.setMargin(new java.awt.Insets(2, 8, 2, 2));
        signupnameentry.setMaximumSize(new java.awt.Dimension(339, 45));
        signupnameentry.setMinimumSize(new java.awt.Dimension(339, 45));
        signupnameentry.setPreferredSize(new java.awt.Dimension(339, 45));
        signupMenu.add(signupnameentry, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 270, -1, -1));

        signuppassentry.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        signuppassentry.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        signuppassentry.setToolTipText("");
        signuppassentry.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        signuppassentry.setMaximumSize(new java.awt.Dimension(339, 45));
        signuppassentry.setMinimumSize(new java.awt.Dimension(339, 45));
        signupMenu.add(signuppassentry, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 380, 339, 45));

        signupsub.setBackground(new java.awt.Color(185, 1, 185));
        signupsub.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        signupsub.setForeground(new java.awt.Color(255, 255, 255));
        signupsub.setText("Sign up");
        signupsub.setMaximumSize(new java.awt.Dimension(339, 45));
        signupsub.setMinimumSize(new java.awt.Dimension(339, 45));
        signupsub.setPreferredSize(new java.awt.Dimension(339, 45));
        signupsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupsubActionPerformed(evt);
            }
        });
        signupMenu.add(signupsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 478, -1, 55));

        signupnamenote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signupnamenote.setForeground(new java.awt.Color(255, 255, 255));
        signupnamenote.setText("* Maximum 20 characters, only a-z, A-Z and numbers.");
        signupMenu.add(signupnamenote, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 283, -1, -1));

        signuppassnote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signuppassnote.setForeground(new java.awt.Color(255, 255, 255));
        signuppassnote.setText("* Minimum 4 characters, Maximum 20 characters.");
        signupMenu.add(signuppassnote, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 393, 333, -1));

        signupnameerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signupnameerror.setForeground(new java.awt.Color(255, 51, 51));
        signupnameerror.setText(" ");
        signupMenu.add(signupnameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 322, 339, -1));

        signuppasserror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        signuppasserror.setForeground(new java.awt.Color(255, 51, 51));
        signuppasserror.setText(" ");
        signupMenu.add(signuppasserror, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 433, 339, -1));

        ProgramFrame.add(signupMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        quitConfirm.setBackground(new java.awt.Color(70, 70, 70));
        quitConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quitConfirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        quittitle1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        quittitle1.setForeground(new java.awt.Color(255, 255, 255));
        quittitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quittitle1.setText("Really quit?");
        quitConfirm.add(quittitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 400, 60));

        quittitle2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quittitle2.setForeground(new java.awt.Color(255, 255, 255));
        quittitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quittitle2.setText("Progress has been saved");
        quitConfirm.add(quittitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 35));

        quityes.setBackground(new java.awt.Color(102, 102, 102));
        quityes.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        quityes.setForeground(new java.awt.Color(255, 255, 255));
        quityes.setText("YES");
        quityes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quityesActionPerformed(evt);
            }
        });
        quitConfirm.add(quityes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, 46));

        quitno.setBackground(new java.awt.Color(102, 102, 102));
        quitno.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        quitno.setForeground(new java.awt.Color(255, 255, 255));
        quitno.setText("NO");
        quitno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitnoActionPerformed(evt);
            }
        });
        quitConfirm.add(quitno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 130, 46));

        ProgramFrame.setLayer(quitConfirm, javax.swing.JLayeredPane.POPUP_LAYER);
        ProgramFrame.add(quitConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 400, 230));

        wishList.setBackground(new java.awt.Color(102, 102, 102));
        wishList.setBorder(null);
        wishList.setHorizontalScrollBar(null);
        wishList.setMaximumSize(new java.awt.Dimension(380, 570));
        wishList.setMinimumSize(new java.awt.Dimension(380, 570));
        wishList.setPreferredSize(null);

        wlpane.setBackground(new java.awt.Color(102, 102, 102));
        wlpane.setMaximumSize(new java.awt.Dimension(380, 160*MAX_WISH));
        wlpane.setMinimumSize(new java.awt.Dimension(380, 570));
        wlpane.setName(""); // NOI18N
        wlpane.setPreferredSize(null);
        wlpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        wishList.setViewportView(wlpane);

        ProgramFrame.setLayer(wishList, javax.swing.JLayeredPane.PALETTE_LAYER);
        ProgramFrame.add(wishList, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 90, 380, 570));

        wlButton.setBackground(new java.awt.Color(185, 124, 60));
        wlButton.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        wlButton.setForeground(new java.awt.Color(255, 255, 255));
        wlButton.setText("Wish List");
        wlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wlButtonActionPerformed(evt);
            }
        });
        ProgramFrame.setLayer(wlButton, javax.swing.JLayeredPane.PALETTE_LAYER);
        ProgramFrame.add(wlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 35, -1, 55));

        quitButton.setBackground(new java.awt.Color(102, 102, 102));
        quitButton.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        quitButton.setForeground(new java.awt.Color(255, 255, 255));
        quitButton.setText("Quit");
        quitButton.setAlignmentY(0.0F);
        quitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        ProgramFrame.setLayer(quitButton, javax.swing.JLayeredPane.PALETTE_LAYER);
        ProgramFrame.add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 35, 120, 55));

        genreMenu.setBackground(new java.awt.Color(51, 51, 51));
        genreMenu.setForeground(new java.awt.Color(247, 247, 247));
        genreMenu.setToolTipText("");
        genreMenu.setMaximumSize(new java.awt.Dimension(1280, 800));
        genreMenu.setMinimumSize(new java.awt.Dimension(1280, 800));
        genreMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genreupper.setBackground(new java.awt.Color(51, 51, 51));
        genreupper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                genreupperMousePressed(evt);
            }
        });
        genreupper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genretitle.setBackground(new java.awt.Color(247, 247, 247));
        genretitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        genretitle.setForeground(new java.awt.Color(255, 255, 255));
        genretitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        genretitle.setText("Genres");
        genreupper.add(genretitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 35, 160, 55));

        genreMenu.add(genreupper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 140));
        genreupper.getAccessibleContext().setAccessibleName("");

        genrelower.setBackground(new java.awt.Color(51, 51, 51));
        genrelower.setBorder(null);
        genrelower.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        genrelower.setMaximumSize(new java.awt.Dimension(1275, 660));
        genrelower.setMinimumSize(new java.awt.Dimension(1275, 660));
        genrelower.setPreferredSize(new java.awt.Dimension(1275, 660));
        genrelower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                genrelowerMousePressed(evt);
            }
        });

        genrepane.setBackground(new java.awt.Color(51, 51, 51));
        genrepane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        genrepane.setMinimumSize(new java.awt.Dimension(1275, 660));
        genrepane.setName(""); // NOI18N
        genrepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        genrelower.setViewportView(genrepane);

        genreMenu.add(genrelower, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        ProgramFrame.add(genreMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        artistMenu.setBackground(new java.awt.Color(51, 51, 51));
        artistMenu.setForeground(new java.awt.Color(247, 247, 247));
        artistMenu.setToolTipText("");
        artistMenu.setMaximumSize(new java.awt.Dimension(1280, 800));
        artistMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        artistupper.setBackground(new java.awt.Color(51, 51, 51));
        artistupper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                artistupperMousePressed(evt);
            }
        });
        artistupper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        artisttitle.setBackground(new java.awt.Color(247, 247, 247));
        artisttitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        artisttitle.setForeground(new java.awt.Color(255, 255, 255));
        artisttitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        artisttitle.setText(" ");
        artistupper.add(artisttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 35, 720, 55));

        artistback.setBackground(new java.awt.Color(102, 102, 102));
        artistback.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        artistback.setForeground(new java.awt.Color(255, 255, 255));
        artistback.setText("Back");
        artistback.setAlignmentY(0.0F);
        artistback.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        artistback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistbackActionPerformed(evt);
            }
        });
        artistupper.add(artistback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 35, 120, 55));

        artistMenu.add(artistupper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 140));

        artistlower.setBackground(new java.awt.Color(51, 51, 51));
        artistlower.setBorder(null);
        artistlower.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        artistlower.setMaximumSize(new java.awt.Dimension(1275, 660));
        artistlower.setMinimumSize(new java.awt.Dimension(1275, 660));
        artistlower.setPreferredSize(new java.awt.Dimension(1275, 660));
        artistlower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                artistlowerMousePressed(evt);
            }
        });

        artistpane.setBackground(new java.awt.Color(51, 51, 51));
        artistpane.setName(""); // NOI18N
        artistpane.setPreferredSize(new java.awt.Dimension(1233, 229));
        artistpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        artistlower.setViewportView(artistpane);

        artistMenu.add(artistlower, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1275, 660));

        ProgramFrame.add(artistMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        titleMenu.setBackground(new java.awt.Color(51, 51, 51));
        titleMenu.setForeground(new java.awt.Color(247, 247, 247));
        titleMenu.setToolTipText("");
        titleMenu.setMaximumSize(new java.awt.Dimension(1280, 800));
        titleMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleupper.setBackground(new java.awt.Color(51, 51, 51));
        titleupper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleupperMousePressed(evt);
            }
        });
        titleupper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titletitle.setBackground(new java.awt.Color(247, 247, 247));
        titletitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titletitle.setForeground(new java.awt.Color(255, 255, 255));
        titletitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        titletitle.setText(" ");
        titleupper.add(titletitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 35, 720, 55));

        titleback.setBackground(new java.awt.Color(102, 102, 102));
        titleback.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        titleback.setForeground(new java.awt.Color(255, 255, 255));
        titleback.setText("Back");
        titleback.setAlignmentY(0.0F);
        titleback.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titlebackActionPerformed(evt);
            }
        });
        titleupper.add(titleback, new org.netbeans.lib.awtextra.AbsoluteConstraints(1075, 35, 120, 55));

        titleMenu.add(titleupper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 140));

        titlelower.setBackground(new java.awt.Color(51, 51, 51));
        titlelower.setBorder(null);
        titlelower.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        titlelower.setMaximumSize(new java.awt.Dimension(1275, 660));
        titlelower.setMinimumSize(new java.awt.Dimension(1275, 660));
        titlelower.setPreferredSize(new java.awt.Dimension(1275, 660));
        titlelower.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlelowerMousePressed(evt);
            }
        });

        titlepane.setBackground(new java.awt.Color(51, 51, 51));
        titlepane.setName(""); // NOI18N
        titlepane.setPreferredSize(new java.awt.Dimension(1233, 229));
        titlepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        titlelower.setViewportView(titlepane);

        titleMenu.add(titlelower, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1275, 660));

        ProgramFrame.add(titleMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        errorPane.setBackground(new java.awt.Color(70, 70, 70));
        errorPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        errorPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorTitle.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        errorTitle.setForeground(new java.awt.Color(255, 255, 255));
        errorTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorTitle.setText("Oops.");
        errorPane.add(errorTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 60));

        errorSub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        errorSub.setForeground(new java.awt.Color(255, 255, 255));
        errorSub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorSub.setText(" ");
        errorPane.add(errorSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 35));

        ErrorOK.setBackground(new java.awt.Color(102, 102, 102));
        ErrorOK.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        ErrorOK.setForeground(new java.awt.Color(255, 255, 255));
        ErrorOK.setText("OK");
        ErrorOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorOKActionPerformed(evt);
            }
        });
        errorPane.add(ErrorOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 155, 130, 46));

        ProgramFrame.setLayer(errorPane, javax.swing.JLayeredPane.POPUP_LAYER);
        ProgramFrame.add(errorPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 400, 230));

        addMenu.setBackground(new java.awt.Color(70, 70, 70));
        addMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addMenu.setPreferredSize(new java.awt.Dimension(520, 274));
        addMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMenuMousePressed(evt);
            }
        });
        addMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addTitle.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        addTitle.setForeground(new java.awt.Color(255, 255, 255));
        addTitle.setText("The Phantom of the Opera (Original 1986 London Cast)");
        addMenu.add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 460, 50));

        addArtist.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        addArtist.setForeground(new java.awt.Color(255, 255, 255));
        addArtist.setText("Andrew Lloyd Webber");
        addMenu.add(addArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 420, 22));

        addBack.setBackground(new java.awt.Color(102, 102, 102));
        addBack.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        addBack.setForeground(new java.awt.Color(255, 255, 255));
        addBack.setText("Back");
        addBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBackActionPerformed(evt);
            }
        });
        addMenu.add(addBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 150, 50));

        addDec1.setBackground(new java.awt.Color(102, 102, 102));
        addDec1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        addDec1.setText("-");
        addDec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDec1ActionPerformed(evt);
            }
        });
        addMenu.add(addDec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 50, 40));

        addNumber.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        addNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addNumber.setText("1");
        addNumber.setPreferredSize(new java.awt.Dimension(70, 40));
        addMenu.add(addNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 50, 40));

        addInc1.setBackground(new java.awt.Color(102, 102, 102));
        addInc1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        addInc1.setText("+");
        addInc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInc1ActionPerformed(evt);
            }
        });
        addMenu.add(addInc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 50, 40));

        addStock.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addStock.setForeground(new java.awt.Color(255, 255, 255));
        addStock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addStock.setText("999+ in stock");
        addMenu.add(addStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 150, 40));

        addButton.setBackground(new java.awt.Color(102, 102, 102));
        addButton.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add to Wish List");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addMenu.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 50));

        ProgramFrame.setLayer(addMenu, javax.swing.JLayeredPane.POPUP_LAYER);
        ProgramFrame.add(addMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 520, 274));

        getContentPane().add(ProgramFrame);
        ProgramFrame.setBounds(0, 0, 1280, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    //<editor-fold defaultstate="collapsed" desc=" MainMenu actions ">
    private void mainloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainloginActionPerformed
        mainMenu.setVisible(false);
        loginMenu.setVisible(true);
    }//GEN-LAST:event_mainloginActionPerformed

    private void mainsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainsignActionPerformed
        mainMenu.setVisible(false);
        signupMenu.setVisible(true);
    }//GEN-LAST:event_mainsignActionPerformed

    private void mainexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mainexitActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" LoginMenu actions ">
    private void loginbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbackActionPerformed
        loginMenu.setVisible(false);
        mainMenu.setVisible(true);
        loginnameentry.setText("");
        loginpassentry.setText("");
        loginnameerror.setText("");
        loginpasserror.setText("");
    }//GEN-LAST:event_loginbackActionPerformed

    private void loginsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginsubActionPerformed
        loginpasserror.setText("");
        loginnameerror.setText("");
        String username = new String();
        String password = new String();
        String pentered = new String(loginpassentry.getPassword());
        // Check if username password matches user XML
        try {
            File inputFile = new File("src/XML/WishList.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            username = doc.getDocumentElement().getNodeName();
            NodeList nList = doc.getElementsByTagName("cd");
            WISH_LENGTH = nList.getLength();
            Node pass = doc.getElementsByTagName("password").item(0);
            if (pass.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) pass;
                password = eElement.getElementsByTagName("pass").item(0).getTextContent();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // If match, build the wish list of user XML
        if (loginnameentry.getText().equals(username) && pentered.equals(password)){
            loginMenu.setVisible(false);
            wishList.setVisible(false);
            wlButton.setVisible(true);
            quitButton.setVisible(true);
            // Cool stuff
            wlButton.setBackground(new java.awt.Color(255,161,0));
            addButton.setBackground(new java.awt.Color(255,161,0));
            // parse user wish list
            CD[] realWish = parseCatalog(WISH_LENGTH, 1);
            int i = 0;
            // only load MAX_WISH number of wish list titles
            while (i < WISH_LENGTH && i < MAX_WISH){
                WISH_LIST[i] = realWish[i];
                i++;
            }
            i = 0;
            while (i < MAX_WISH && i < WISH_LENGTH){
                buildWL(i);
                i++;
            }
            buildGenre();
            genreMenu.setVisible(true);
        } else if (!loginnameentry.getText().equals(username)){
            loginnameerror.setText("* We cannot find this user.");
        } else {
            loginpasserror.setText("* Username and password does not match.");
        }
    }//GEN-LAST:event_loginsubActionPerformed
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" SignupMenu actions ">
    private void signupbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbackActionPerformed
        signupMenu.setVisible(false);
        mainMenu.setVisible(true);
        // Clear 
        signupnameentry.setText("");
        signuppassentry.setText("");
        signupnameerror.setText("");
        signuppasserror.setText("");
    }//GEN-LAST:event_signupbackActionPerformed

    private void signupsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupsubActionPerformed
        signupnameerror.setText(" ");
        signuppasserror.setText(" ");
        int state = 0;
        // Check if username and password are valid
        if (signupnamecheck(signupnameentry.getText()) == 1){
            signupnameerror.setText("* That is an invalid username, Please try again.");
            state = 1;
        }
        if (signuppasscheck(signuppassentry.getPassword()) == 1){
            signuppasserror.setText("* That is an invalid password, Please try again.");
            state = 1;
        }
        if (state == 0){
            // Wish list set empty
            WISH_LENGTH = 0;
            WISH_LIST = new CD[MAX_WISH];
            signupMenu.setVisible(false);
            wishList.setVisible(false);
            addWishEmpty();
            wlButton.setVisible(true);
            quitButton.setVisible(true);
            // Cool stuff
            wlButton.setBackground(new java.awt.Color(185,1,185));
            addButton.setBackground(new java.awt.Color(185,1,185));
            buildGenre();
            genreMenu.setVisible(true);
        }
    }//GEN-LAST:event_signupsubActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" GuestMenu actions ">
    private void mainguestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainguestActionPerformed
        mainMenu.setVisible(false);
        // Hide Wish List
        wishList.setVisible(false);
        wlButton.setVisible(false);
        // Hide add Menu components
        addButton.setVisible(false);
        addDec1.setVisible(false);
        addInc1.setVisible(false);
        addNumber.setVisible(false);
        
        quitButton.setVisible(true);
        buildGenre();
        genreMenu.setVisible(true);
    }//GEN-LAST:event_mainguestActionPerformed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Wishlist button ">
    private void wlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wlButtonActionPerformed
        if (addMenu.isVisible()){
            if (wlButton.isSelected()) {
                wlButton.setSelected(false);
            } else {
                wlButton.setSelected(true);
            }
            addMenu.setVisible(false);;
        } else {
            if (wlButton.isSelected()){
                wishList.setVisible(true);
            } else {
                wishList.setVisible(false);
            }
        }
    }//GEN-LAST:event_wlButtonActionPerformed
    private void genreupperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genreupperMousePressed
        if (quitConfirm.isVisible()) {}
        wishList.setVisible(false);
        wlButton.setSelected(false);
    }//GEN-LAST:event_genreupperMousePressed
    private void genrelowerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genrelowerMousePressed
        if (quitConfirm.isVisible()) {}
        wishList.setVisible(false);
        wlButton.setSelected(false);
    }//GEN-LAST:event_genrelowerMousePressed
    private void artistupperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artistupperMousePressed
        wishList.setVisible(false);
        wlButton.setSelected(false);
    }//GEN-LAST:event_artistupperMousePressed
    private void artistlowerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artistlowerMousePressed
        wishList.setVisible(false);
        wlButton.setSelected(false);
    }//GEN-LAST:event_artistlowerMousePressed
    private void titleupperMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleupperMousePressed
        wishList.setVisible(false);
        wlButton.setSelected(false);
        addMenu.setVisible(false);;
    }//GEN-LAST:event_titleupperMousePressed
    private void titlelowerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlelowerMousePressed
        wishList.setVisible(false);
        wlButton.setSelected(false);
        addMenu.setVisible(false);;
    }//GEN-LAST:event_titlelowerMousePressed
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" QuitConfirm actions ">
    private void quityesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quityesActionPerformed
        this.getContentPane().removeAll();
        WISH_LIST = new CD[MAX_WISH];
        WISH_LENGTH = 0;
        initComponents();
        initcondition();
    }//GEN-LAST:event_quityesActionPerformed

    private void quitnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitnoActionPerformed
        quitConfirm.setVisible(false);
    }//GEN-LAST:event_quitnoActionPerformed
    //</editor-fold>
    
    /* Quitbutton action */
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        quitConfirm.setVisible(true);
    }//GEN-LAST:event_quitButtonActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc=" Back button actions ">
    private void titlebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titlebackActionPerformed
        if (wlButton.isSelected()){
            wlButton.setSelected(false);
            wishList.setVisible(false);
        } else if (addMenu.isVisible()){
            addMenu.setVisible(false);;
        } else {
        titleMenu.setVisible(false);
        titlepane.removeAll();
        titlepane.revalidate();
        artistMenu.setVisible(true);
        }
    }//GEN-LAST:event_titlebackActionPerformed

    private void artistbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistbackActionPerformed
        if (wlButton.isSelected()){
            wlButton.setSelected(false);
            wishList.setVisible(false);
        } else {
        artistMenu.setVisible(false);
        artistpane.removeAll();
        artistpane.revalidate();
        quitButton.setVisible(true);
        genreMenu.setVisible(true);
        }
    }//GEN-LAST:event_artistbackActionPerformed

    private void addBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBackActionPerformed
        addMenu.setVisible(false);;
    }//GEN-LAST:event_addBackActionPerformed
    //</editor-fold>
    
    private void addMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMenuMousePressed
        // DO ABSOLUTELY NOTHING
        // THIS IS MEANINGFUL
    }//GEN-LAST:event_addMenuMousePressed

    private void ErrorOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorOKActionPerformed
        errorPane.setVisible(false);
    }//GEN-LAST:event_ErrorOKActionPerformed

    private void addDec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDec1ActionPerformed
        int num = Integer.parseInt(addNumber.getText());
        if (num > 1){
            addNumber.setText(Integer.toString(num - 1));
        }
    }//GEN-LAST:event_addDec1ActionPerformed

    private void addInc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInc1ActionPerformed
        int num = Integer.parseInt(addNumber.getText());
        addNumber.setText(Integer.toString(num + 1));
    }//GEN-LAST:event_addInc1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        System.out.println(Integer.toString(WISH_LENGTH));
        if (WISH_LENGTH == MAX_WISH) {
            errorTitle.setText("Sorry.");
            errorSub.setText("You cannot add more than " + Integer.toString(MAX_WISH) + " albums to the wishlist.");
            errorPane.setVisible(true);
        } else {
            try {
                wlpane.setVisible(false);
                wlpane.removeAll();
                int clength = catalogLength("src/XML/CDcatalog.txt");
                CD[] catalog = parseCatalog(clength, 0);
                int i = 0;
                int x = 0;
                while (i < WISH_LENGTH) {
                    if (addTitle.getText().equals(WISH_LIST[i].Title)){
                        int number = Integer.parseInt(addNumber.getText()) + WISH_LIST[i].number;
                        WISH_LIST[i].number = number;
                        x = 1;
                        break;
                    }
                    i++;
                }
                if (x == 0){
                    i = 0;
                    x = 0;
                    while (i < clength) {
                        if (addTitle.getText().equals(catalog[i].Title)){
                            int number = Integer.parseInt(addNumber.getText());
                            CD disk = new CD(catalog[i].Genre, catalog[i].Artist, catalog[i].Title, number);
                            WISH_LIST[WISH_LENGTH] = disk;
                            x = 1;
                            break;
                        }
                        i++;
                    }
                    if (x!=0){
                        WISH_LENGTH++;
                    }
                }
                addMenu.setVisible(false);
            } catch (java.lang.NumberFormatException e) {
                errorPane.setVisible(true);
                errorTitle.setText("Yo.");
                errorSub.setText("Don't enter things other than numbers");
            }
            int i = 0;
            while (i < WISH_LENGTH) {
                buildWL(i);
                i++;
            }
            wlpane.setVisible(true);
        }
    }//GEN-LAST:event_addButtonActionPerformed
    
    //<editor-fold defaultstate="collapsed" desc=" Sign up checkers ">
    public int signupnamecheck (String s){
        char[] array = s.toCharArray();
        if (array.length > 20 || array.length < 1){
            return 1;
        }
        int i = 0;
        while (i < array.length){
            int dec = array[i] & 0xff;
            if (dec < 48 || 
                    (65 > dec) && (dec > 57) || 
                    (97 > dec) && (dec > 90) || 
                    dec > 122){
                return 1;
            }
            i++;
        }
        return 0;
    }

    public int signuppasscheck (char[] s){
        if (s.length > 20 || s.length < 4){
            return 1;
        }
        return 0;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" XML parsers ">
    // Parse an XML and return its info as an array of CD info
    public CD[] parseCatalog(int cataloglength, int type){
        CD[] CDList = new CD[cataloglength];
         // Fill the array with XML info
        try {
            String path = new String();
            if (type == 0){
                path = "src/XML/CDcatalog.txt";
            } else if (type == 1){
                path = "src/XML/WishList.txt";
            }
            File inputFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //String docname = doc.getDocumentElement().getNodeName(); // catalog
            NodeList nList = doc.getElementsByTagName("cd");
            for (int temp = 0; temp < cataloglength; temp++) {
                Node nNode = nList.item(temp);
                //String nodename = nNode.getNodeName(); //cd
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String genre = eElement.getElementsByTagName("genre").item(0).getTextContent();
                    String artist = eElement.getElementsByTagName("artist").item(0).getTextContent();
                    String title = eElement.getElementsByTagName("title").item(0).getTextContent();
                    CD disk = new CD(genre, artist, title, 0);
                    if (type == 0) {
                        disk.number=0;
                    } else if (type == 1){
                        int number = Integer.parseInt(eElement.getElementsByTagName("number").item(0).getTextContent());
                        disk.number = number;
                    }
                    CDList[temp] = disk;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CDList;
    }
    
    // Parse an XML and return its length
    public int catalogLength(String path){
        // Get the number of elements in XML: 
        // https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
        int cataloglength = 0;
        try {
            File inputFile = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            //String docname = doc.getDocumentElement().getNodeName(); // catalog
            NodeList nList = doc.getElementsByTagName("cd");
            cataloglength = nList.getLength();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cataloglength;
    }
   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Genre/Artist/Title/Add menu ">
    // Generate a page of genre buttons from an XML
    public void buildGenre (){
        // parse catalog
        int cataloglength = catalogLength("src/XML/CDcatalog.txt");
        CD[] CDList = parseCatalog(cataloglength, 0);
        //<editor-fold defaultstate="collapsed" desc=" Generate GenreMenu ">
        // Get a list of genres
        String[] GenreList = new String[MAX_GENRE];
        int gindex = 0;
        int cindex = 0;
        while (cindex < cataloglength) {
            // When the array is empty, just copy the first genre
            if (gindex == 0) {
                GenreList[0] = CDList[0].Genre;
                cindex++;
                gindex++;
            // else check if genre is already in the array
            } else {
                int lindex = 0;
                int indicator = 0;
                while (lindex < gindex){
                    if (GenreList[lindex].equals(CDList[cindex].Genre)){
                        indicator = 1;
                        break;
                    } 
                    lindex++;
                }
                // only copy if it's not
                if (indicator == 0) {
                    GenreList[gindex] = CDList[cindex].Genre;
                    gindex ++;
                }
                cindex++;
            }
        }
         // Use GenreList to build GenreMenu
        int index = 0;
        int xindex = 0;
        int yindex = 0;
        while (index < gindex) {
            if (xindex >= 3){
                newgenre(GenreList[index], xindex, yindex, cataloglength, CDList).setVisible(true);
                index ++;
                yindex ++;
                xindex = 0;
            } else {
                newgenre(GenreList[index], xindex, yindex,  cataloglength, CDList).setVisible(true);
                index++;
                xindex++;
            }
        }
        //</editor-fold>
    }
    
    // Add a new genre icon using position index and a genre, 
    // also generate a page of artist icons in that a genre.
    public javax.swing.JLabel newgenre(String genre, int xindex, int yindex, int cataloglength, CD[] CDList){
        // Initialize element
        javax.swing.JLabel newgenre = new javax.swing.JLabel();
        String filepath = "src/processed_genre_img/genre-" + genre + ".png";
        newgenre.setIcon(new javax.swing.ImageIcon(filepath));
        newgenre.setText(genre);
        // Calculate position using index
        int xpos = 60 + 300 * xindex;
        int ypos = 20 + yindex * 310;
        // Make genrepane longer if neccessary
        if (yindex > 1){
        genrepane.setPreferredSize(new java.awt.Dimension(1275, 680 + (yindex - 1) * 310));
        }
        // Put the newgenre into genrepane
        genrepane.add(newgenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, ypos, 240, 240));
        // Text below pic
        javax.swing.JLabel gensub = new javax.swing.JLabel();
        gensub.setForeground(new java.awt.Color(255, 255, 255));
        gensub.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        gensub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gensub.setText(genre);
        genrepane.add(gensub, new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, 245 + ypos, 240, 40));
        // Set the functionality of each element
        newgenre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (quitConfirm.isVisible()) {
                } else if(wlButton.isSelected()) {
                    wlButton.setSelected(false);
                    wishList.setVisible(false);
                } else {
                //<editor-fold defaultstate="collapsed" desc=" Generate ArtistMenu based on a specific genre ">
                String[] ArtistList = new String[MAX_ARTIST];
                int aindex = 0;
                int cindex = 0;
                // put all artists in this genre in an array
                while (cindex < cataloglength) {
                    // if array is empty
                    if (aindex == 0) {
                        // just copy the first artist in genre to array
                        if (genre.equals(CDList[cindex].Genre)){
                            ArtistList[0] = CDList[cindex].Artist;
                            aindex++;
                        }
                        cindex++;
                    } else {
                        // else check if the artist is already in array
                        int lindex = 0;
                        int indicator = 0;
                        while (lindex < aindex){
                            if (ArtistList[lindex].equals(CDList[cindex].Artist)){
                                indicator = 1;
                                break;
                            } 
                            lindex++;
                        }
                        // only copy if he/she's not
                        if (indicator == 0 && CDList[cindex].Genre.equals(genre)) {
                            ArtistList[aindex] = CDList[cindex].Artist;
                            aindex ++;
                        }
                        cindex++;
                    }
                }
                // build a page of artist icons
                int index = 0;
                int xindex = 0;
                int yindex = 0;
                while (index < aindex) {
                    if (xindex >= 3){
                        newartist(ArtistList[index], genre, xindex, yindex, cataloglength, CDList).setVisible(true);
                        index++;
                        yindex++;
                        xindex = 0;
                    } else {
                        newartist(ArtistList[index], genre, xindex, yindex,  cataloglength, CDList).setVisible(true);
                        index++;
                        xindex++;
                    }
                }
                //</editor-fold>
                // When a genre is pressed
                artisttitle.setText(genre);
                genreMenu.setVisible(false);
                artistMenu.setVisible(true);
                quitButton.setVisible(false);
                }
            }
        });
        return newgenre;
    }
    
    // Add a new artist icon using position index and an artist, 
    // also generate a page of title icons by that artist.
    public javax.swing.JLabel newartist(String artist, String genre, int xindex, int yindex, int cataloglength, CD[] CDList){
        // Initialize element
        javax.swing.JLabel newartist;
        newartist = new javax.swing.JLabel();
        newartist.setBackground(new java.awt.Color(255, 255, 255));
        String filepath = "src/processed_artist_img/" + artist + ".png";
        newartist.setIcon(new javax.swing.ImageIcon(filepath));
        newartist.setText(artist);
        // Calculate position using index
        int xpos = 60 + 300 * xindex;
        int ypos = 20 + yindex * 310;
        // Make artistpane longer if neccessary
        if (yindex > 1){
        artistpane.setPreferredSize(new java.awt.Dimension(1263, 680 + (yindex - 1) * 310));
        }
        // Put the newartist into artistpane
        artistpane.add(newartist, new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, ypos, 240, 240));
        // label under icon
        javax.swing.JLabel artsub = new javax.swing.JLabel();
        artsub.setForeground(new java.awt.Color(255, 255, 255));
        artsub.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        artsub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        artsub.setText(artist);
        artistpane.add(artsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, 245 + ypos, 240, 40));
        // Set the functionality of each element
        newartist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (wlButton.isSelected()){
                    wlButton.setSelected(false);
                    wishList.setVisible(false);
                } else {
                //<editor-fold defaultstate="collapsed" desc=" Generate TitleMenu based on a specific artist ">
                String[] TitleList = new String[MAX_TITLE];
                int tindex = 0;
                int cindex = 0;
                // put all titles belong to this artist into an array
                while (cindex < cataloglength) {
                    if (CDList[cindex].Artist.equals(artist)) {
                        TitleList[tindex] = CDList[cindex].Title;
                        tindex ++;
                    }
                    cindex++;
                }
                int index = 0;
                int xindex = 0;
                int yindex = 0;
                // build a page of title icons
                while (index < tindex) {
                    if (xindex >= 3){
                        newtitle(TitleList[index], xindex, yindex, artist).setVisible(true);
                        index ++;
                        yindex ++;
                        xindex = 0;
                    } else {
                        newtitle(TitleList[index], xindex, yindex, artist).setVisible(true);
                        index++;
                        xindex++;
                    }
                }
                //</editor-fold>
                titletitle.setText(genre + ": " + artist);
                artistMenu.setVisible(false);
                titleMenu.setVisible(true);
                }
            }
        });
        return newartist;
    }
    
    // Add a new title icon using position index and an title, 
    public javax.swing.JLabel newtitle(String title, int xindex, int yindex, String artist){
        // Initialize icon
        javax.swing.JLabel newtitle = new javax.swing.JLabel();
        // get the icon
        String ptitle = "";
        for (String s : title.split(":")){
            ptitle+= s;
        }
        String filepath = "src/processed_title_img/" + ptitle + ".png";
        // put the icon
        newtitle.setIcon(new javax.swing.ImageIcon(filepath));
        newtitle.setText(title);
         // Calculate position using index
        int xpos = 60 + 300 * xindex;
        int ypos = 20 + yindex * 310;
        // Make artistpane longer if neccessary
        if (yindex > 1){
        titlepane.setPreferredSize(new java.awt.Dimension(1263, 680 + (yindex - 1) * 310));
        }
        // Put the icon into pane
        titlepane.add(newtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, ypos, 240, 240));
        // put a label under it 
        javax.swing.JLabel titsub = new javax.swing.JLabel();
        titsub.setForeground(new java.awt.Color(255, 255, 255));
        titsub.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        titsub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titsub.setText(title);
        titlepane.add(titsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, 245 + ypos, 240, 40));
        newtitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if (wlButton.isSelected()){
                    wlButton.setSelected(false);
                    wishList.setVisible(false);
                } else if (addMenu.isVisible()){
                    addMenu.setVisible(false);;
                }else {
                    newadd(title, artist);
                    addMenu.setVisible(true);
                }
            }
        });
        return newtitle;
    }
    
    // Pop an add menu using a cd
    private void newadd(String title, String artist){
        addTitle.setText(title);
        addArtist.setText(artist);
        addNumber.setText(Integer.toString(1));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" WishList content manipulators ">
    // Add a new waitlist element using position index and a cd
    public javax.swing.JPanel buildWL (int index) {
        // initialize
        javax.swing.JPanel nwl = new javax.swing.JPanel();
        javax.swing.JLabel nwltitle = new javax.swing.JLabel();
        javax.swing.JLabel nwlartist = new javax.swing.JLabel();
        javax.swing.JButton nwlinc1 = new javax.swing.JButton();
        javax.swing.JButton nwldec1 = new javax.swing.JButton();
        javax.swing.JButton nwlremove = new javax.swing.JButton();
        javax.swing.JLabel nwlcover = new javax.swing.JLabel();
        javax.swing.JLabel nwlnumber = new javax.swing.JLabel();
        javax.swing.JPanel nwlnumberpane = new javax.swing.JPanel();
        // main pane
        nwl.setBackground(new java.awt.Color(102,102,102));
        nwl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(72, 72, 72));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(102, 102, 102));
            }
        });
        nwl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        // title
        nwltitle.setText(WISH_LIST[index].Title);
        nwltitle.setFont(new java.awt.Font("Cambria", 0, 18));
        nwltitle.setForeground(new java.awt.Color(255, 255, 255));
        nwl.add(nwltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 12, 200, 34));
        // artist
        nwlartist.setText(WISH_LIST[index].Artist);
        nwlartist.setFont(new java.awt.Font("Cambria", 0, 14));
        nwlartist.setForeground(new java.awt.Color(255, 255, 255));
        nwl.add(nwlartist, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 48, 200, 34));
        // remove button
        String filepath = "src/icons/trash24x24.png";
        nwlremove.setIcon(new javax.swing.ImageIcon(filepath));
        nwlremove.setBackground(new java.awt.Color(102, 102, 102));
        nwlremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(72, 72, 72));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(102, 102, 102));
            }
        });
        nwlremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nwlrmv(index);
            }
        });
        nwl.add(nwlremove, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 100, 50, 36));
        // + button
        nwlinc1.setFont(new java.awt.Font("Cambria", 0, 24)); 
        nwlinc1.setBorder(null);
        nwlinc1.setText("+");
        nwlinc1.setForeground(new java.awt.Color(255, 255, 255));
        nwlinc1.setBackground(new java.awt.Color(153, 153, 153));
        nwlinc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(72, 72, 72));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(102, 102, 102));
            }
        });
         nwlinc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int wln = Integer.parseInt(nwlnumber.getText()) + 1;
                if (wln <= 0){
                    nwlrmv(index);
                } else {
                    nwlnumber.setText(Integer.toString(wln));
                    WISH_LIST[index].number++;
                }
            }
        });
        nwl.add(nwlinc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 40, 36));
        // - button
        nwldec1.setFont(new java.awt.Font("Cambria", 0, 24));
        nwldec1.setBorder(null);
        nwldec1.setText("-");
        nwldec1.setForeground(new java.awt.Color(255, 255, 255));
        nwldec1.setBackground(new java.awt.Color(153, 153, 153));
        nwldec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(72, 72, 72));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(102, 102, 102));
            }
        });
        nwldec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int wln = Integer.parseInt(nwlnumber.getText()) - 1;
                if (wln <= 0){
                    nwlrmv(index);
                } else {
                    nwlnumber.setText(Integer.toString(wln));
                    WISH_LIST[index].number--;
                }
            }
        });
        nwl.add(nwldec1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 40, 36));
        // number of item
        nwlnumber.setText(Integer.toString(WISH_LIST[index].number));
        nwlnumber.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        nwlnumber.setBorder(null);
        nwlnumber.setFont(new java.awt.Font("Cambria", 0, 18)); 
        nwlnumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(72, 72, 72));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nwl.setBackground(new java.awt.Color(102, 102, 102));
            }
        });
        nwlnumberpane.setLayout(new java.awt.GridLayout());
        nwlnumberpane.add(nwlnumber);
        nwl.add(nwlnumberpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 40, 36));
        // cover image
        String ptitle = "";
        for (String s : WISH_LIST[index].Title.split(":")){
            ptitle+= s;
        }
        filepath = "src/small_title_img/" + ptitle + ".png";
        nwlcover.setIcon(new javax.swing.ImageIcon(filepath));
        nwl.add(nwlcover, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, 130, 130));
        wlpane.add(nwl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0 + 160 * index, 380, 160));
        // return
        return nwl;
    }
    
    // remove a title and refresh waitlist 
    private void nwlrmv(int index){
            // remove everything
            wlpane.setVisible(false);
            wlpane.removeAll();
            // replace original wishlist with title removed
            if (WISH_LENGTH > 0){
                int i = 0;
                int x = 0;
                CD[] newWL = new CD[MAX_WISH];
                while (i < WISH_LENGTH){
                    if (i != index) {
                        newWL[x] = WISH_LIST[i];
                        x++;
                    }
                    i++;
                }
                WISH_LENGTH --;
                WISH_LIST = newWL;
                // Refresh
                i = 0;
                while (i < WISH_LENGTH) {
                    if (i == index){
                        buildWL(i).setBackground(new java.awt.Color(72, 72, 72));
                    } else {
                        buildWL(i);
                    }
                    i++;
                }
            }
            // If there's nothing, display wishEmpty
            if (WISH_LENGTH <= 0) {
            addWishEmpty();
            }
        wlpane.setVisible(true);
    }
    
     private void addWishEmpty(){
        javax.swing.JPanel wishempty = new javax.swing.JPanel();
        javax.swing.JLabel emptytitle = new javax.swing.JLabel();
        javax.swing.JLabel emptysub = new javax.swing.JLabel();
        wishempty.setBackground(new java.awt.Color(102, 102, 102));
        wishempty.setPreferredSize(new java.awt.Dimension(380, 154));
        wishempty.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        emptytitle.setBackground(new java.awt.Color(255, 255, 255));
        emptytitle.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        emptytitle.setForeground(new java.awt.Color(153, 153, 153));
        emptytitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptytitle.setText("Your wish list is empty");
        wishempty.add(emptytitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 380, 40));
        emptysub.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        emptysub.setForeground(new java.awt.Color(153, 153, 153));
        emptysub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emptysub.setText("Go add some more stuff");
        wishempty.add(emptysub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 380, 30));
        wlpane.add(wishempty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 154));
     }
    //</editor-fold>
    
    public static void main(String args[]) {
        /* Set the Window Classic look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new MainMenu().setVisible(true);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc=" Variables declaration ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ErrorOK;
    private javax.swing.JLayeredPane ProgramFrame;
    private javax.swing.JLabel addArtist;
    private javax.swing.JButton addBack;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addDec1;
    private javax.swing.JButton addInc1;
    private javax.swing.JPanel addMenu;
    private javax.swing.JTextField addNumber;
    private javax.swing.JLabel addStock;
    private javax.swing.JLabel addTitle;
    private javax.swing.JLayeredPane artistMenu;
    private javax.swing.JButton artistback;
    private javax.swing.JScrollPane artistlower;
    private javax.swing.JPanel artistpane;
    private javax.swing.JLabel artisttitle;
    private javax.swing.JPanel artistupper;
    private javax.swing.JPanel errorPane;
    private javax.swing.JLabel errorSub;
    private javax.swing.JLabel errorTitle;
    private javax.swing.JLayeredPane genreMenu;
    private javax.swing.JScrollPane genrelower;
    private javax.swing.JPanel genrepane;
    private javax.swing.JLabel genretitle;
    private javax.swing.JPanel genreupper;
    private javax.swing.JPanel loginMenu;
    private javax.swing.JButton loginback;
    private javax.swing.JLabel loginname;
    private javax.swing.JTextField loginnameentry;
    private javax.swing.JLabel loginnameerror;
    private javax.swing.JLabel loginpass;
    private javax.swing.JPasswordField loginpassentry;
    private javax.swing.JLabel loginpasserror;
    private javax.swing.JButton loginsub;
    private javax.swing.JLabel logintitle;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton mainexit;
    private javax.swing.JButton mainguest;
    private javax.swing.JButton mainlogin;
    private javax.swing.JButton mainsign;
    private javax.swing.JLabel maintitle;
    private javax.swing.JButton quitButton;
    private javax.swing.JPanel quitConfirm;
    private javax.swing.JButton quitno;
    private javax.swing.JLabel quittitle1;
    private javax.swing.JLabel quittitle2;
    private javax.swing.JButton quityes;
    private javax.swing.JPanel signupMenu;
    private javax.swing.JButton signupback;
    private javax.swing.JLabel signupname;
    private javax.swing.JTextField signupnameentry;
    private javax.swing.JLabel signupnameerror;
    private javax.swing.JLabel signupnamenote;
    private javax.swing.JLabel signuppass;
    private javax.swing.JPasswordField signuppassentry;
    private javax.swing.JLabel signuppasserror;
    private javax.swing.JLabel signuppassnote;
    private javax.swing.JButton signupsub;
    private javax.swing.JLabel signuptitle;
    private javax.swing.JLayeredPane titleMenu;
    private javax.swing.JButton titleback;
    private javax.swing.JScrollPane titlelower;
    private javax.swing.JPanel titlepane;
    private javax.swing.JLabel titletitle;
    private javax.swing.JPanel titleupper;
    private javax.swing.JScrollPane wishList;
    private javax.swing.JToggleButton wlButton;
    private javax.swing.JPanel wlpane;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
