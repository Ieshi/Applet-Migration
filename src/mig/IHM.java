package mig;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.sql.*;

public class IHM extends JFrame 
{
	private JTextField loginBaseDepart, loginBaseArrivee, passBaseDepart, passBaseArrivee, urlBaseDepart, urlBaseArrivee, nomBDD;
	private JButton migButton;
	private JPanel baseDepart, baseArrivee, etat, mig;
	private JLabel labelLoginDepart, labelLoginArrivee, labelPassDepart, labelPassArrivee, labelurlDepart, labelurlArrivee, labelBDD, labelEtat, labelBaseDepart, labelBaseArrivee;
	protected JTextArea etatDescription;
	
	public IHM()
	{
		this.setVisible(true);
		this.setTitle("Migration");
		this.setSize(1020,460);
		this.setResizable(false);
		
		this.setLocationRelativeTo(null);

		initComponents();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
	public void initComponents()
	{
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setPreferredSize(new Dimension(1020,460));
		panelPrincipal.setBackground(new Color(216,209,217));
		this.add(panelPrincipal);
		
		FlowLayout layoutPrincipal = new FlowLayout();
		layoutPrincipal.setHgap(0);
		layoutPrincipal.setVgap(0);
		panelPrincipal.setLayout(layoutPrincipal);
		
		
		//--------------------------- Base de départ ---------------------------------


		baseDepart = new JPanel();
		baseDepart.setPreferredSize(new Dimension(500,170));
		baseDepart.setBackground(new Color(216,209,217));
		
		urlBaseDepart = new JTextField("");
		urlBaseDepart.setPreferredSize(new Dimension(200,20));
		
		loginBaseDepart = new JTextField("");
		loginBaseDepart.setPreferredSize(new Dimension(200,20));
		
		passBaseDepart = new JPasswordField("");
		passBaseDepart.setPreferredSize(new Dimension(200,20));
		

		labelBaseDepart = new JLabel("Base de depart");
        labelBaseDepart.setHorizontalAlignment(JLabel.CENTER);
        labelBaseDepart.setVerticalAlignment(JLabel.CENTER);
		labelBaseDepart.setFont(new Font("Serif", Font.BOLD, 20));
		labelBaseDepart.setForeground(Color.black);
		labelBaseDepart.setPreferredSize(new Dimension(500,35));
		labelBaseDepart.setOpaque(true);
		labelBaseDepart.setBackground(new Color(115,58,99));
		
		labelurlDepart = new JLabel("URL de la base de depart: ");
		labelurlDepart.setForeground(Color.WHITE);
		labelurlDepart.setLabelFor(urlBaseDepart);
		labelurlDepart.setPreferredSize(new Dimension(190,35));
		labelurlDepart.setFont(new Font("Arial", Font.PLAIN, 14));
		
		labelLoginDepart = new JLabel("Login: ");
		labelLoginDepart.setLabelFor(loginBaseDepart);
		labelLoginDepart.setForeground(Color.WHITE);
		labelLoginDepart.setPreferredSize(new Dimension(190,35));
		labelLoginDepart.setFont(new Font("Arial", Font.PLAIN, 14));
		
		labelPassDepart = new JLabel("Mot de passe: ");
		labelPassDepart.setLabelFor(passBaseDepart);
		labelPassDepart.setForeground(Color.WHITE);
		labelPassDepart.setPreferredSize(new Dimension(190,35));
		labelPassDepart.setFont(new Font("Arial", Font.PLAIN, 14));
		
		
		baseDepart.add(labelBaseDepart);
		
		baseDepart.add(labelurlDepart);
		baseDepart.add(urlBaseDepart);
		
		baseDepart.add(labelLoginDepart);
		baseDepart.add(loginBaseDepart);
		
		baseDepart.add(labelPassDepart);
		baseDepart.add(passBaseDepart);

		panelPrincipal.add(baseDepart);
		
		
		//--------------------------- Base d'arrivee ---------------------------------


		baseArrivee = new JPanel();
		baseArrivee.setPreferredSize(new Dimension(500,170));
		baseArrivee.setBackground(new Color(216,209,217));
		
		urlBaseArrivee = new JTextField("");
		urlBaseArrivee.setPreferredSize(new Dimension(200,20));
		
		loginBaseArrivee = new JTextField("");
		loginBaseArrivee.setPreferredSize(new Dimension(200,20));
		
		passBaseArrivee = new JPasswordField("");
		passBaseArrivee.setPreferredSize(new Dimension(200,20));
		

		labelBaseArrivee = new JLabel("Base d'arrivee");
        labelBaseArrivee.setHorizontalAlignment(JLabel.CENTER);
        labelBaseArrivee.setVerticalAlignment(JLabel.CENTER);
		labelBaseArrivee.setFont(new Font("Serif", Font.BOLD, 20));
		labelBaseArrivee.setForeground(Color.BLACK);
		labelBaseArrivee.setPreferredSize(new Dimension(500,35));
		labelBaseArrivee.setOpaque(true);
		labelBaseArrivee.setBackground(new Color(115,58,99));
		
		labelurlArrivee = new JLabel("URL de la base d'arrivee: ");
		labelurlArrivee.setForeground(Color.WHITE);
		labelurlArrivee.setLabelFor(urlBaseArrivee);
		labelurlArrivee.setPreferredSize(new Dimension(190,35));
		labelurlArrivee.setFont(new Font("Arial", Font.PLAIN, 14));
		
		labelLoginArrivee = new JLabel("Login: ");
		labelLoginArrivee.setLabelFor(loginBaseArrivee);
		labelLoginArrivee.setForeground(Color.WHITE);
		labelLoginArrivee.setPreferredSize(new Dimension(190,35));
		labelLoginArrivee.setFont(new Font("Arial", Font.PLAIN, 14));
		
		labelPassArrivee = new JLabel("Mot de passe: ");
		labelPassArrivee.setLabelFor(passBaseArrivee);
		labelPassArrivee.setForeground(Color.WHITE);
		labelPassArrivee.setPreferredSize(new Dimension(190,35));
		labelPassArrivee.setFont(new Font("Arial", Font.PLAIN, 14));
		
		baseArrivee.add(labelBaseArrivee);
		
		baseArrivee.add(labelurlArrivee);
		baseArrivee.add(urlBaseArrivee);
		
		baseArrivee.add(labelLoginArrivee);
		baseArrivee.add(loginBaseArrivee);
		
		baseArrivee.add(labelPassArrivee);
		baseArrivee.add(passBaseArrivee);
		
		panelPrincipal.add(baseArrivee);
		
		//------------- Bouton Migrer ------------
		
		nomBDD = new JTextField("");
		nomBDD.setPreferredSize(new Dimension (200,20));
		
		labelBDD = new JLabel("Base: ");
		labelBDD.setLabelFor(nomBDD);
		labelBDD.setForeground(Color.BLACK);
		labelBDD.setPreferredSize(new Dimension(100,40));
		labelBDD.setFont(new Font("Serif", Font.BOLD, 16));

		mig = new JPanel();
		mig.setPreferredSize(new Dimension(1000,45));
		mig.setBackground(new Color(115,58,99));
		
		migButton = new JButton("Migrer !");
		migButton.setPreferredSize(new Dimension(200,30));
		migButton.setForeground(new Color(115,58,99));
		migButton.setFont(new Font("Serif", Font.BOLD, 16));
		migButton.setBackground(new Color(216,209,217));
		migButton.addActionListener(new ActionListener()
				{

					public void actionPerformed(ActionEvent arg0)
					{
						migrer();
					}
			
				});
		

		JPanel tmp = new JPanel();
		tmp.setPreferredSize(new Dimension(500,30));
		tmp.setBackground(new Color(115,58,99));
		BorderLayout layouttmp = new BorderLayout();
		tmp.setLayout(layouttmp);
		tmp.add(migButton, BorderLayout.EAST);
		
		mig.add(labelBDD);
		
		mig.add(nomBDD);
		
		mig.add(tmp);
		
		panelPrincipal.add(mig);
		
		// ------------------ Etat et Erreurs -------------
		
		etat = new JPanel();
		etat.setPreferredSize(new Dimension(1010,200));
		etat.setBackground(new Color(216,209,217));
		
		labelEtat = new JLabel("Etat & Erreur");
        labelEtat.setVerticalAlignment(JLabel.CENTER);
		labelEtat.setPreferredSize(new Dimension(990,15));
		labelEtat.setFont(new Font("Arial", Font.ITALIC, 12));
		labelEtat.setForeground(new Color(115,58,99));
		
		etatDescription = new JTextArea();
		etatDescription.setPreferredSize(new Dimension(990,200));
		etatDescription.setEditable(false);
		etatDescription.setFont(new Font("Arial", Font.PLAIN, 12));
		
		etat.add(labelEtat);
		etat.add(new JScrollPane(etatDescription));
		
		panelPrincipal.add(etat);
	}
	
	
	void migrer()
	{
		ConnexionBDD bddSource = new ConnexionBDD(urlBaseDepart.getText(), nomBDD.getText(), loginBaseDepart.getText(), passBaseDepart.getText());
		etatDescription.setText(" => " + bddSource.connexionState + "\n");
		
		ConnexionBDD bddDestination = new ConnexionBDD(urlBaseArrivee.getText(), nomBDD.getText(), loginBaseArrivee.getText(), passBaseArrivee.getText());
		etatDescription.setText(etatDescription.getText() + " => " + bddDestination.connexionState + "\n");
		
		String tmp="";
		int rs=0;
		try
		{
			DatabaseMetaData dataSource = bddSource.con.getMetaData();
			ResultSet tablesSource = dataSource.getTables(bddSource.con.getCatalog(), null, "%", null);
			
			etatDescription.setText(etatDescription.getText() + " => Reception des donnee de la base reussi! \n");
					
			while(tablesSource.next() && rs!=-2) //Pour chaque table
			{
				
			    String reqSource = "Select * from " + tablesSource.getString(3) + ";";
				ResultSet rsSource = bddSource.state.executeQuery(reqSource);
				
				
				etatDescription.setText(etatDescription.getText() + " => " + "Select reussi ! \n");
				
				int columnCount = rsSource.getMetaData().getColumnCount();
			    String reqCreation="CREATE TABLE " + tablesSource.getString(3) + "("; //On commence a écrire la requete de la création de la table
			    
				for(int j=1; j<=columnCount-1;j++) //Pour chaque colonne jusqu'a l'avant dernière (a cause de la ",")
					reqCreation +=rsSource.getMetaData().getColumnName(j) + " " + rsSource.getMetaData().getColumnTypeName(j).toString() + ", ";

			      reqCreation +=rsSource.getMetaData().getColumnName(columnCount) + " " + rsSource.getMetaData().getColumnTypeName(columnCount).toString() + ")";

			      try {rs = bddDestination.state.executeUpdate(reqCreation);}//On crée la table dans la base de donnée destination
			      catch(SQLException e) {rs=-2; etatDescription.setText(etatDescription.getText() + " => Erreur lors de la création de la table: " + e.getMessage() + "\n" );}

				if(rs!=-2) etatDescription.setText(etatDescription.getText() + " => " + "Creation reussie ! \n");
	
				
				int index=1;
				while (rsSource.next() && rs!=-2) //On insère chaque élément dans la nouvelle table
				{
					String reqInsertion = "Insert into " + tablesSource.getString(3) + " values " + "("; //On commence la requete d'insertion
					
					Object tmpInsertion="";
					for(int i=1; i<=columnCount-1; i++)//Comme pour la dernière requete
					{
						tmpInsertion =rsSource.getObject(i);
						if(tmpInsertion instanceof String)
							tmpInsertion="'"+tmpInsertion+"'";
						reqInsertion+=tmpInsertion+",";
					}
					
					tmpInsertion =rsSource.getObject(columnCount);
					if(tmpInsertion instanceof String)
						tmpInsertion="'"+tmpInsertion+"'";
					reqInsertion+=tmpInsertion+");";  //et on fini par la dernière colonne
		
					try {rs = bddDestination.state.executeUpdate(reqInsertion);}//On crée la table dans la base de donnée destination
				    catch(SQLException e) {rs=-2; etatDescription.setText(etatDescription.getText() + " => Erreur lors de l'insertion N° " + index + ": " + e.getMessage() + "\n" );}
				    
					index++;
				}
				
				if(rs!=-2) etatDescription.setText(etatDescription.getText() + " => " + "Insertion reussie !\n");
				
				String reqDrop = "Drop Table " + tablesSource.getString(3) + ";";
				if(rs!=-2) 
				{
					try {rs = bddSource.state.executeUpdate(reqDrop);}//On crée la table dans la base de donnée destination
			        catch(SQLException e) {rs=-2; etatDescription.setText(etatDescription.getText() + " => Erreur lors de la supression de la table: " + e.getMessage() + "\n" );}
				}

				if(rs!=-2) etatDescription.setText(etatDescription.getText() + " => " + "Suppression reussie ! \n");
				
				etatDescription.setText(etatDescription.getText() + "\n" + "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
			}
		}
		catch(Exception e)
		{
			tmp=" => " + e.getMessage() + "\n";
		}
		
		if(rs!=-2) tmp=" => Migration reussie ! \n";
		etatDescription.setText(etatDescription.getText() + tmp);
		
		
		
		
	}

}
