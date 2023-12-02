package FrontPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationPage extends JFrame {
   private Dimension screenSize;
   private ImageIcon logoIcon1, logoIcon2a, logoIcon2b;
   private Container con;
   private JMenuBar barLine;
   private JLabel logo, title, word;
	public JLabel fName;
	public JTextField fNameT;
   public JLabel mName;
   public JTextField mNameT;
   public JLabel lName;
   public JTextField lNameT;
   public JLabel suff;
   public JComboBox<String> suffix;
	public JLabel gender;
	public JRadioButton male, female;
	public ButtonGroup genderGrp;
	public JLabel dateOfBirth;
	public JComboBox<String> month, date, year;
	public JLabel place; 
	public JComboBox<String> country;
   public JLabel civilStatus;
   public JComboBox<String> status;
   public JLabel email;
	public JTextField emailT;
	public JCheckBox terms;
	private JButton submit, reset;
   private JLabel black1, black2;

   public String suffixes[] 
      = { "None", "Jr.", "Sr.", "III", "IV", "V", "VI" };
      
	private String months[]
		= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
         
	private String dates[]
		= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", 
         "29", "30", "31"};
         
	public String years[]
		= {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", 
         "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013",
         "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
         
   private String countries[]
      = {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia",
         "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium",
         "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria",
         "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad",
         "Chile", "China", "Colombia", "Comoros", "Congo", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic",
         "Democratic Republic of the Congo", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor",
         "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji",
         "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala",
         "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran",
         "Iraq", "Ireland", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya",
         "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon",
         "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia",
         "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova",
         "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal",
         "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan",
         "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal",
         "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines",
         "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone",
         "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain",
         "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania",
         "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda",
         "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu",
         "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"};
      
   private String listStatus[]
      = {"Single", "Married", "Divorced", "Widowed", "Separated", "In a relationship", 
         "Domestic partnership", "Civil union"};
      
	public RegistrationPage() {
		setTitle("Milkipedia Registration");
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
      
      logoIcon1 = new ImageIcon("logoOrig.png");
      setIconImage(logoIcon1.getImage());
      logoIcon2a = new ImageIcon("black.png");
      logoIcon2b = new ImageIcon("blackRev.png");
      
		con = getContentPane();
		con.setLayout(null);

      barLine = new JMenuBar();
      barLine.setBounds(0, 0, screenSize.width-15, 35);
      barLine.setBackground(Color.BLACK);
      con.add(barLine);

      logo = new JLabel();
      logo.setBounds(310, 63, 140, 130);
      logo.setIcon(logoIcon1);
      con.add(logo);
      
		title = new JLabel("MILKIPEDIA");
      title.setForeground(Color.BLACK);
		title.setFont(new Font("Courier", Font.BOLD, 100));
		title.setBounds(450, 70, 1000, 80);
		con.add(title);
      
      word = new JLabel("Registration");
      word.setForeground(Color.BLACK);
      word.setFont(new Font("Courier", Font.BOLD, 40));
      word.setBounds(450, 145, 300, 50);
      con.add(word);

		fName = new JLabel("First Name");
		fName.setForeground(Color.BLACK);
      fName.setFont(new Font("Courier", Font.BOLD, 18));
		fName.setBounds(550, 205, 110, 21);
		con.add(fName);

		fNameT = new JTextField();
      fNameT.setForeground(Color.BLACK);
      fNameT.setText("");
		fNameT.setFont(new Font("Courier", Font.PLAIN, 15));
      fNameT.setBackground(Color.WHITE);
      fNameT.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	   fNameT.setBounds(690, 205, 130, 21);
		con.add(fNameT);
      
      mName = new JLabel("Middle Name");
		mName.setForeground(Color.BLACK);
      mName.setFont(new Font("Courier", Font.BOLD, 18));
		mName.setBounds(550, 240, 130, 21);
		con.add(mName);
      
      mNameT = new JTextField();
	   mNameT.setForeground(Color.BLACK);
      mNameT.setFont(new Font("Courier", Font.PLAIN, 15));
      mNameT.setBackground(Color.WHITE);
      mNameT.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		mNameT.setBounds(690, 240, 130, 21);
		con.add(mNameT);

      lName = new JLabel("Last Name");
		lName.setForeground(Color.BLACK);
      lName.setFont(new Font("Courier", Font.BOLD, 18));
		lName.setBounds(550, 275, 110, 21);
		con.add(lName);
      
      lNameT = new JTextField();
		lNameT.setForeground(Color.BLACK);
      lNameT.setFont(new Font("Courier", Font.PLAIN, 15));
      lNameT.setBackground(Color.WHITE);
      lNameT.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		lNameT.setBounds(690, 275, 130, 21);
		con.add(lNameT);
      
      suff = new JLabel("Suffix");
		suff.setForeground(Color.BLACK);
      suff.setFont(new Font("Courier", Font.BOLD, 18));
		suff.setBounds(550, 310, 110, 21);
		con.add(suff);
      
      suffix = new JComboBox<String>(suffixes);
		suffix.setForeground(Color.BLACK);
      suffix.setFont(new Font("Courier", Font.PLAIN, 15));
      suffix.setBackground(Color.WHITE);
      suffix.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		suffix.setBounds(690, 310, 70, 21);
      suffix.setFocusable(false);
		con.add(suffix);

		gender = new JLabel("Gender");
		gender.setForeground(Color.BLACK);
      gender.setFont(new Font("Courier", Font.BOLD, 18));
		gender.setBounds(550, 345, 110, 21);
		con.add(gender);

		male = new JRadioButton("Male");
		male.setForeground(Color.BLACK);
      male.setFont(new Font("Courier", Font.PLAIN, 15));
		male.setSelected(true);
		male.setBounds(685, 345, 70, 21);
      male.setFocusable(false);
		con.add(male);

		female = new JRadioButton("Female");
		female.setForeground(Color.BLACK);
      female.setFont(new Font("Courier", Font.PLAIN, 15));
		female.setSelected(false);
		female.setBounds(765, 345, 110, 21);
      female.setFocusable(false);
		con.add(female);

		genderGrp = new ButtonGroup();
		genderGrp.add(male);
		genderGrp.add(female);

		dateOfBirth = new JLabel("Date Of Birth");
		dateOfBirth.setForeground(Color.BLACK);
      dateOfBirth.setFont(new Font("Courier", Font.BOLD, 18));
		dateOfBirth.setBounds(550, 380, 150, 21);
		con.add(dateOfBirth);

      month = new JComboBox<String>(months);
		month.setForeground(Color.BLACK);
      month.setFont(new Font("Courier", Font.PLAIN, 15));
      month.setBackground(Color.WHITE);
      month.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		month.setBounds(705, 380, 60, 21);
      month.setFocusable(false);
		con.add(month);
      
		date = new JComboBox<String>(dates);
		date.setForeground(Color.BLACK);
      date.setFont(new Font("Courier", Font.PLAIN, 15));
      date.setBackground(Color.WHITE);
      date.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		date.setBounds(775, 380, 50, 21);
      date.setFocusable(false);
		con.add(date);

		year = new JComboBox<String>(years);
		year.setForeground(Color.BLACK);
      year.setFont(new Font("Courier", Font.PLAIN, 15));
      year.setBackground(Color.WHITE);
      year.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		year.setBounds(835, 380, 70, 21);
      year.setFocusable(false);
		con.add(year);

      civilStatus = new JLabel("Civil Status");
      civilStatus.setForeground(Color.BLACK);
      civilStatus.setFont(new Font("Courier", Font.BOLD, 18));
      civilStatus.setBounds(550, 415, 150, 21);
      con.add(civilStatus);
      
      status = new JComboBox<String>(listStatus);
      status.setForeground(Color.BLACK);
      status.setFont(new Font("Courier", Font.PLAIN, 15));
      status.setBackground(Color.WHITE);
      status.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      status.setBounds(705, 415, 110, 21);
      status.setFocusable(false);
      con.add(status);

		place = new JLabel("Country");
		place.setForeground(Color.BLACK);
      place.setFont(new Font("Courier", Font.BOLD, 18));
		place.setBounds(550, 450, 110, 21);
		con.add(place);

		country = new JComboBox<String>(countries);
		country.setForeground(Color.BLACK);
      country.setFont(new Font("Courier", Font.PLAIN, 15));
      country.setBackground(Color.WHITE);
      country.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		country.setBounds(705, 450, 130, 21);
      country.setFocusable(false);
		con.add(country);
      
      email = new JLabel("Email Address");
      email.setForeground(Color.BLACK);
      email.setFont(new Font("Courier", Font.BOLD, 18));
      email.setBounds(550, 485, 150, 21);
      con.add(email);

      emailT = new JTextField();
      emailT.setForeground(Color.BLACK);
      emailT.setFont(new Font("Courier", Font.PLAIN, 15));
      emailT.setBackground(Color.WHITE);
      emailT.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      emailT.setBounds(705, 485, 190, 21);
      con.add(emailT);
      
		terms = new JCheckBox("Accept Terms And Conditions.");
		terms.setForeground(Color.BLACK);
      terms.setFont(new Font("Courier", Font.ITALIC, 17));
		terms.setBounds(550, 520, 350, 30);
      terms.setFocusable(false);
		con.add(terms);

		submit = new JButton("SUBMIT");
		submit.setForeground(Color.BLACK);
      submit.setFont(new Font("Courier", Font.BOLD, 18));
      submit.setBackground(Color.WHITE);
      submit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		submit.setBounds(550, 580, 110, 30);
      submit.setFocusable(false);
      submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      submit.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         submit.setBackground(Color.BLACK);
         submit.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         submit.setBackground(Color.WHITE);
         submit.setForeground(Color.BLACK);
      }
      });
      
		con.add(submit);

		reset = new JButton("RESET");
      reset.setForeground(Color.BLACK);
		reset.setFont(new Font("Courier", Font.BOLD, 18));
      reset.setBackground(Color.WHITE);
      reset.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		reset.setBounds(750, 580, 110, 30);
      reset.setFocusable(false);
      reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      reset.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         reset.setBackground(Color.BLACK);
         reset.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         reset.setBackground(Color.WHITE);
         reset.setForeground(Color.BLACK);
      }
      });
      
		con.add(reset);
      
      black1 = new JLabel();
      black1.setIcon(logoIcon2a);
      black1.setBounds(-175, -10, 500, 500);
      con.add(black1);
      
      black2 = new JLabel();
      black2.setIcon(logoIcon2b);
      black2.setBounds(1027, 280, 500, 500);
      con.add(black2);
      
		setVisible(true);
	}

   public JCheckBox getTerms() {
      return terms;
   }

   public JButton getSubmit() {
      return submit;
   }
   
   public JButton getReset() {
      return reset;
   }
}
