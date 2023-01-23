/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;


import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jpl7.*;

public class search_frm extends javax.swing.JFrame {

    public search_frm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ageComboBox = new javax.swing.JComboBox<>();
        actionChk = new javax.swing.JCheckBox();
        adventureChk = new javax.swing.JCheckBox();
        animationChk = new javax.swing.JCheckBox();
        comedyChk = new javax.swing.JCheckBox();
        crimeChk = new javax.swing.JCheckBox();
        familyChk = new javax.swing.JCheckBox();
        dramaChk = new javax.swing.JCheckBox();
        fantasyChk = new javax.swing.JCheckBox();
        historyChk = new javax.swing.JCheckBox();
        horrorChk = new javax.swing.JCheckBox();
        musicChk = new javax.swing.JCheckBox();
        romanceChk = new javax.swing.JCheckBox();
        mysteryChk = new javax.swing.JCheckBox();
        thrillerChk = new javax.swing.JCheckBox();
        warChk = new javax.swing.JCheckBox();
        durationComboBox = new javax.swing.JComboBox<>();
        countryComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        languageComboBox = new javax.swing.JComboBox<>();
        ratingComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        moviesLst = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "G", "PG", "PG-13", "R", "NR" }));
        ageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageComboBoxActionPerformed(evt);
            }
        });

        actionChk.setText("Action");
        actionChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionChkActionPerformed(evt);
            }
        });

        adventureChk.setText("Adventure");

        animationChk.setText("Animation");
        animationChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animationChkActionPerformed(evt);
            }
        });

        comedyChk.setText("Comedy");
        comedyChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comedyChkActionPerformed(evt);
            }
        });

        crimeChk.setText("Crime");
        crimeChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crimeChkActionPerformed(evt);
            }
        });

        familyChk.setText("Family");
        familyChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyChkActionPerformed(evt);
            }
        });

        dramaChk.setText("Drama");
        dramaChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dramaChkActionPerformed(evt);
            }
        });

        fantasyChk.setText("Fantasy");
        fantasyChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fantasyChkActionPerformed(evt);
            }
        });

        historyChk.setText("History");
        historyChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyChkActionPerformed(evt);
            }
        });

        horrorChk.setText("Horror");
        horrorChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horrorChkActionPerformed(evt);
            }
        });

        musicChk.setText("Music");
        musicChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicChkActionPerformed(evt);
            }
        });

        romanceChk.setText("Romance");
        romanceChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanceChkActionPerformed(evt);
            }
        });

        mysteryChk.setText("Mystery");
        mysteryChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mysteryChkActionPerformed(evt);
            }
        });

        thrillerChk.setText("Thriller");
        thrillerChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thrillerChkActionPerformed(evt);
            }
        });

        warChk.setText("War");
        warChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warChkActionPerformed(evt);
            }
        });

        durationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Short(0:60)", "Medium(+60:90)", "Long(+90)" }));

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "America", "Egypt", "England", "Australia", "India", "Spain", "France", "Italy", "Korea", "Germany" }));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));

        languageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "English", "Arabic", "Indian", "Russian", "Italian", "Spanish", "German", "French" }));

        ratingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "+9", "+8", "+7", "+6", "+5", "+4", "+3", "+2", "+1", "+0" }));
        ratingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Age:");

        jLabel2.setText("Duration:");

        jLabel3.setText("Rating:");

        jLabel4.setText("Country:");

        jLabel5.setText("Year:");

        jLabel6.setText("Language:");

        submitBtn.setText("Submit");
        submitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitBtnMouseClicked(evt);
            }
        });

        moviesLst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moviesLstMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(moviesLst);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(actionChk)
                        .addGap(26, 26, 26)
                        .addComponent(adventureChk)
                        .addGap(27, 27, 27)
                        .addComponent(animationChk)
                        .addGap(18, 18, 18)
                        .addComponent(comedyChk)
                        .addGap(18, 18, 18)
                        .addComponent(crimeChk)
                        .addGap(34, 34, 34)
                        .addComponent(dramaChk)
                        .addGap(26, 26, 26)
                        .addComponent(familyChk)
                        .addGap(18, 18, 18)
                        .addComponent(fantasyChk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(historyChk)
                        .addGap(22, 22, 22)
                        .addComponent(horrorChk)
                        .addGap(27, 27, 27)
                        .addComponent(musicChk)
                        .addGap(18, 18, 18)
                        .addComponent(mysteryChk)
                        .addGap(18, 18, 18)
                        .addComponent(romanceChk)
                        .addGap(18, 18, 18)
                        .addComponent(thrillerChk)
                        .addGap(18, 18, 18)
                        .addComponent(warChk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(durationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(submitBtn))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actionChk)
                    .addComponent(adventureChk)
                    .addComponent(animationChk)
                    .addComponent(comedyChk)
                    .addComponent(crimeChk)
                    .addComponent(dramaChk)
                    .addComponent(familyChk)
                    .addComponent(fantasyChk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(historyChk)
                    .addComponent(horrorChk)
                    .addComponent(musicChk)
                    .addComponent(mysteryChk)
                    .addComponent(romanceChk)
                    .addComponent(thrillerChk)
                    .addComponent(warChk))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ratingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(durationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageComboBoxActionPerformed

    private void actionChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actionChkActionPerformed

    private void animationChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animationChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_animationChkActionPerformed

    private void comedyChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comedyChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comedyChkActionPerformed

    private void crimeChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crimeChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crimeChkActionPerformed

    private void familyChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_familyChkActionPerformed

    private void dramaChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dramaChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dramaChkActionPerformed

    private void fantasyChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fantasyChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fantasyChkActionPerformed

    private void historyChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyChkActionPerformed

    private void horrorChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horrorChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horrorChkActionPerformed

    private void musicChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicChkActionPerformed

    private void romanceChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanceChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_romanceChkActionPerformed

    private void mysteryChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mysteryChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mysteryChkActionPerformed

    private void thrillerChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thrillerChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thrillerChkActionPerformed

    private void warChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warChkActionPerformed

    private void ratingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ratingComboBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(int i=2019; i>=1920; i--)
        {
            yearComboBox.addItem(java.lang.Integer.toString(i));
        }
    }//GEN-LAST:event_formWindowOpened

    private void submitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitBtnMouseClicked
        //Consult the knowledge base
        Query q1 = new Query("consult('movies.pl')");
        q1.hasSolution();

        //Get the year
        String year = (String) yearComboBox.getSelectedItem();
        if(year.equals("All"))
            year = "_";
        
        //Get the rating
        String rating = (String) ratingComboBox.getSelectedItem();
        if(rating.equals("All"))
            rating = "-1";
        else
            rating = String.valueOf(rating.charAt(1));
        
        //Get the country
        String country = "'" + (String) countryComboBox.getSelectedItem() + "'";
        if(country.equals("'All'"))
            country = "_";
        
        //Get the language
        String language = "'" + (String) languageComboBox.getSelectedItem() + "'";
        if(language.equals("'All'"))
            language = "_";
        
        //Get the age
        String age = "'" + (String) ageComboBox.getSelectedItem() + "'";
        if(age.equals("'All'"))
            age = "_";
        
        //Get the duration 
        String duration = java.lang.Integer.toString(durationComboBox.getSelectedIndex());
        if(duration.equals("0"))
            duration = "_";
        else if(duration.equals("1"))
            duration = "short";
        else if(duration.equals("2"))
            duration = "mid";
        else
            duration = "long";
        
        //Store the check box values into a boolean array
        boolean genre_arr[] = new boolean[] 
        {
            actionChk.isSelected(),
            adventureChk.isSelected(),
            animationChk.isSelected(),
            comedyChk.isSelected(),
            crimeChk.isSelected(),
            dramaChk.isSelected(),
            familyChk.isSelected(),
            fantasyChk.isSelected(),
            historyChk.isSelected(),
            horrorChk.isSelected(),
            musicChk.isSelected(),
            mysteryChk.isSelected(),
            romanceChk.isSelected(),
            thrillerChk.isSelected(),
            warChk.isSelected()
        };
        
        //Check if the user dosn't select any check boxes
        boolean is_all_zeros = true;
        for(int i=0; i<genre_arr.length-1; i++)
        {
            if(genre_arr[i])
                is_all_zeros = false;
        }
        
        //Create the list
        String genre_list;
        if(is_all_zeros)
            genre_list = "_";
        else
        {
            genre_list = "[";
            for(int i=0; i<genre_arr.length-1; i++)
            {
                genre_list += genre_arr[i] ? "1" : "0";
                genre_list += ",";
            }
            genre_list += genre_arr[genre_arr.length-1] ? "1" : "0";
            genre_list += "]";
        }
        

        //Make a quey about the movie
        String str = "find_movie(X," + year + "," + genre_list + "," + rating + "," + country + "," + language + "," + duration + "," + age + ")";
        q1 = new Query(str);
        
        //Check if there are solutions for the query
        if(q1.hasSolution())
        {
            Map<String, Term>[] res = q1.allSolutions();
               
            DefaultListModel moviesLstModel = new DefaultListModel();
            for(int i=0; i<res.length; i++){
                moviesLstModel.addElement(removeQuotes(res[i].get("X").toString()));
            }
            
            moviesLst.setModel(moviesLstModel);
        }
        else
            JOptionPane.showMessageDialog(this,"No Movies Found", "Error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_submitBtnMouseClicked

    private void moviesLstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moviesLstMouseClicked
        String movieName = moviesLst.getSelectedValue();
        new displayMovie_frm(movieName).setVisible(true);
    }//GEN-LAST:event_moviesLstMouseClicked

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
            java.util.logging.Logger.getLogger(search_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_frm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_frm().setVisible(true);
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
    private javax.swing.JCheckBox actionChk;
    private javax.swing.JCheckBox adventureChk;
    private javax.swing.JComboBox<String> ageComboBox;
    private javax.swing.JCheckBox animationChk;
    private javax.swing.JCheckBox comedyChk;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JCheckBox crimeChk;
    private javax.swing.JCheckBox dramaChk;
    private javax.swing.JComboBox<String> durationComboBox;
    private javax.swing.JCheckBox familyChk;
    private javax.swing.JCheckBox fantasyChk;
    private javax.swing.JCheckBox historyChk;
    private javax.swing.JCheckBox horrorChk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> languageComboBox;
    private javax.swing.JList<String> moviesLst;
    private javax.swing.JCheckBox musicChk;
    private javax.swing.JCheckBox mysteryChk;
    private javax.swing.JComboBox<String> ratingComboBox;
    private javax.swing.JCheckBox romanceChk;
    private javax.swing.JButton submitBtn;
    private javax.swing.JCheckBox thrillerChk;
    private javax.swing.JCheckBox warChk;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
