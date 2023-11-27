package FrontPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

public class RegistrationPage extends JFrame implements ActionListener {
   private Dimension screenSize;
   private ImageIcon logoIcon;
   private ImageIcon admin;
   private Container con;
   private JLabel logo;
	private JLabel title;
   private JLabel word;
	private JLabel fName;
	private JTextField fNameT;
   private JLabel mName;
   private JTextField mNameT;
   private JLabel lName;
   private JTextField lNameT;
   private JLabel suff;
   private JComboBox suffix;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup genderGrp;
	private JLabel dateOfBirth;
	private JComboBox month;
	private JComboBox date;
	private JComboBox year;
	private JLabel place; 
	private JComboBox country;
   private JLabel civilStatus;
   private JComboBox status;
   private JLabel email;
	private JTextField emailT;
	private JCheckBox term;
	private JButton submit;
	private JButton reset;
   private LocalDate dateNow;
   private int age;

   private String suffixes[] 
      = { "None", "Jr.", "Sr.", "III", "IV", "V", "VI" };
      
	private String months[]
		= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
         
	private String dates[]
		= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", 
         "29", "30", "31"};
         
	private String years[]
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
      
      logoIcon = new ImageIcon("logoOrig.png");
      setIconImage(logoIcon.getImage());
      
		con = getContentPane();
		con.setLayout(null);

      logo = new JLabel();
      logo.setBounds(310, 23, 140, 130);
      logo.setIcon(logoIcon);
      con.add(logo);
      
		title = new JLabel("MILKIPEDIA");
		title.setFont(new Font("Courier", Font.BOLD, 100));
		title.setBounds(450, 30, 1000, 80);
		con.add(title);
      
      word = new JLabel("Registration");
      word.setFont(new Font("Courier", Font.BOLD, 40));
      word.setBounds(450, 110, 300, 50);
      con.add(word);

		fName = new JLabel("First Name");
		fName.setFont(new Font("Courier", Font.BOLD, 18));
		fName.setBounds(550, 175, 110, 21);
		con.add(fName);

		fNameT = new JTextField();
      fNameT.setText("");
		fNameT.setFont(new Font("Courier", Font.PLAIN, 15));
	   fNameT.setBounds(690, 175, 130, 21);
		con.add(fNameT);
      
      mName = new JLabel("Middle Name");
		mName.setFont(new Font("Courier", Font.BOLD, 18));
		mName.setBounds(550, 210, 130, 21);
		con.add(mName);
      
      mNameT = new JTextField();
	   mNameT.setFont(new Font("Courier", Font.PLAIN, 15));
		mNameT.setBounds(690, 210, 130, 21);
		con.add(mNameT);

      lName = new JLabel("Last Name");
		lName.setFont(new Font("Courier", Font.BOLD, 18));
		lName.setBounds(550, 245, 110, 21);
		con.add(lName);
      
      lNameT = new JTextField();
		lNameT.setFont(new Font("Courier", Font.PLAIN, 15));
		lNameT.setBounds(690, 245, 130, 21);
		con.add(lNameT);
      
      suff = new JLabel("Suffix");
		suff.setFont(new Font("Courier", Font.BOLD, 18));
		suff.setBounds(550, 280, 110, 21);
		con.add(suff);
      
      suffix = new JComboBox(suffixes);
		suffix.setFont(new Font("Courier", Font.PLAIN, 15));
		suffix.setBounds(690, 280, 70, 21);
		con.add(suffix);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Courier", Font.BOLD, 18));
		gender.setBounds(550, 315, 110, 21);
		con.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Courier", Font.PLAIN, 15));
		male.setSelected(true);
		male.setBounds(685, 315, 70, 21);
      male.setFocusable(false);
		con.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Courier", Font.PLAIN, 15));
		female.setSelected(false);
		female.setBounds(765, 315, 110, 21);
      female.setFocusable(false);
		con.add(female);

		genderGrp = new ButtonGroup();
		genderGrp.add(male);
		genderGrp.add(female);

		dateOfBirth = new JLabel("Date Of Birth");
		dateOfBirth.setFont(new Font("Courier", Font.BOLD, 18));
		dateOfBirth.setBounds(550, 350, 150, 21);
		con.add(dateOfBirth);

      month = new JComboBox(months);
		month.setFont(new Font("Courier", Font.PLAIN, 15));
		month.setBounds(705, 350, 60, 21);
		con.add(month);
      
		date = new JComboBox(dates);
		date.setFont(new Font("Courier", Font.PLAIN, 15));
		date.setBounds(775, 350, 40, 21);
		con.add(date);

		year = new JComboBox(years);
		year.setFont(new Font("Courier", Font.PLAIN, 15));
		year.setBounds(825, 350, 70, 21);
		con.add(year);

      civilStatus = new JLabel("Civil Status");
      civilStatus.setFont(new Font("Courier", Font.BOLD, 18));
      civilStatus.setBounds(550, 385, 150, 21);
      con.add(civilStatus);
      
      status = new JComboBox(listStatus);
      status.setFont(new Font("Courier", Font.PLAIN, 15));
      status.setBounds(705, 385, 110, 21);
      con.add(status);

		place = new JLabel("Country");
		place.setFont(new Font("Courier", Font.BOLD, 18));
		place.setBounds(550, 420, 110, 21);
		con.add(place);

		country = new JComboBox(countries);
		country.setFont(new Font("Courier", Font.PLAIN, 15));
		country.setBounds(705, 420, 130, 21);
		con.add(country);
      
      email = new JLabel("Email Address");
      email.setFont(new Font("Courier", Font.BOLD, 18));
      email.setBounds(550, 455, 150, 21);
      con.add(email);

      emailT = new JTextField();
      emailT.setFont(new Font("Courier", Font.PLAIN, 15));
      emailT.setBounds(705, 455, 190, 21);
      con.add(emailT);
      
		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Courier", Font.ITALIC, 17));
		term.setBounds(550, 490, 350, 30);
      term.setFocusable(false);
		con.add(term);

		submit = new JButton("SUBMIT");
		submit.setFont(new Font("Courier", Font.BOLD, 18));
		submit.setBounds(550, 545, 110, 30);
		submit.addActionListener(this);
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
		reset.setFont(new Font("Courier", Font.BOLD, 18));
		reset.setBounds(750, 545, 110, 30);
      reset.setFocusable(false);
		reset.addActionListener(this);
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
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit)  {
         dateNow = LocalDate.now();
         age = dateNow.getYear() - Integer.parseInt(years[year.getSelectedIndex()]);
         
         admin = new ImageIcon("logoSmall.png");
         JOptionPane.showMessageDialog(null, "Registered Successfully!", "Milkipedia Admin", JOptionPane.INFORMATION_MESSAGE, admin);
         this.dispose();
      }

		else if (e.getSource() == reset) {
			fNameT.setText("");
         mNameT.setText("");
         lNameT.setText("");
         suffix.setSelectedIndex(0);
         date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
         emailT.setText("");
         country.setSelectedIndex(0);
         term.setSelected(false);
		}
	}
}
