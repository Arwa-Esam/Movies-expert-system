package movies;
import java.util.Map;
import org.jpl7.*;


public class displayMovie_frm extends javax.swing.JFrame {

    /**
     * Creates new form displayMovie
     */
    public displayMovie_frm() {
        initComponents();
    }
    
    public displayMovie_frm(String movieName) {
        initComponents();
        
        String genre[] = new String []
        {
            "Action",
            "Adventure",
            "Animation",
            "Comedy",
            "Crime",
            "Drama",
            "Family",
            "Fantasy",
            "History",
            "Horror",
            "Music",
            "Mystery",
            "Romance",
            "Thriller",
            "War"
        };
        
        //Consult the knowledge base
        Query q1 = new Query("consult('movies.pl')");
        q1.hasSolution();
        
        String str = "movie(" + "'" + movieName + "'" + ", Year, Type, Rating, Country, Language, Duration, Age" + ")";
        q1 = new Query(str);
        
        Map<String, Term>[] res = q1.allSolutions();
        
        movieLbl.setText(movieLbl.getText() + " " + movieName);
        yearLbl.setText(yearLbl.getText() + " " + res[0].get("Year").toString());
        ratingLbl.setText(ratingLbl.getText() + " " + res[0].get("Rating").toString());
        countryLbl.setText(countryLbl.getText() + " " + removeQuotes(res[0].get("Country").toString()));
        languageLbl.setText(languageLbl.getText() + " " + removeQuotes(res[0].get("Language").toString()));
        durationLbl.setText(durationLbl.getText() + " " + res[0].get("Duration").toString());
        ageLbl.setText(ageLbl.getText() + " " + removeQuotes(res[0].get("Age").toString()));
        
        genreLbl.setText(genreLbl.getText() + " ");
        Term[] type = res[0].get("Type").toTermArray();
        
        
        for(int i=0; i<type.length; i++)
        {
            if(type[i].intValue() == 1)
                genreLbl.setText(genreLbl.getText() + genre[i] + " ");
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movieLbl = new javax.swing.JLabel();
        yearLbl = new javax.swing.JLabel();
        ratingLbl = new javax.swing.JLabel();
        countryLbl = new javax.swing.JLabel();
        languageLbl = new javax.swing.JLabel();
        durationLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        genreLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        movieLbl.setText("Movie: ");

        yearLbl.setText("Year:");

        ratingLbl.setText("Rating:");

        countryLbl.setText("Country:");

        languageLbl.setText("Language:");

        durationLbl.setText("Duration:");

        ageLbl.setText("Age:");

        genreLbl.setText("Genre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ratingLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(movieLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countryLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(languageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                    .addComponent(durationLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ageLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(movieLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(yearLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ratingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(genreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(countryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(languageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(durationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(ageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(displayMovie_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(displayMovie_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(displayMovie_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(displayMovie_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new displayMovie_frm().setVisible(true);
            }
        });
    }
    
    public static String removeQuotes(String str)
    {
        String res = "";
        for(int i=1; i<str.length()-1; i++)
            res += str.charAt(i);
        return res;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JLabel countryLbl;
    private javax.swing.JLabel durationLbl;
    private javax.swing.JLabel genreLbl;
    private javax.swing.JLabel languageLbl;
    private javax.swing.JLabel movieLbl;
    private javax.swing.JLabel ratingLbl;
    private javax.swing.JLabel yearLbl;
    // End of variables declaration//GEN-END:variables
}
