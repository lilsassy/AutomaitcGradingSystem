public class AutomaticGradingSystem extends javax.swing.JFrame {

    /**
     * Creates new form AutomaticGradingSystem
     */
    public AutomaticGradingSystem() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ite186TF = new javax.swing.JTextField();
        ite048TF = new javax.swing.JTextField();
        art002TF = new javax.swing.JTextField();
        gen008TF = new javax.swing.JTextField();
        ped026TF = new javax.swing.JTextField();
        ite399TF = new javax.swing.JTextField();
        eng213TF = new javax.swing.JTextField();
        nst022TF = new javax.swing.JTextField();
        ite186letterTF = new javax.swing.JTextField();
        ite048letterTF = new javax.swing.JTextField();
        art002letterTF = new javax.swing.JTextField();
        gen008letterTF = new javax.swing.JTextField();
        ped026letterTF = new javax.swing.JTextField();
        ite399letterTF = new javax.swing.JTextField();
        eng213letterTF = new javax.swing.JTextField();
        nst022letterTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        averageTF = new javax.swing.JTextField();
        gpaTF = new javax.swing.JTextField();
        average = new javax.swing.JLabel();
        gpa = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Automatic Grading System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ITE186:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ITE048:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ART002:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("GEN008:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("PED026:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("ENG213:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("NST022:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("ITE399:");

        ite186TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ite186TFActionPerformed(evt);
            }
        });

        ped026TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ped026TFActionPerformed(evt);
            }
        });

        nst022TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nst022TFActionPerformed(evt);
            }
        });

        ite186letterTF.setEditable(false);
        ite186letterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ite186letterTFActionPerformed(evt);
            }
        });

        ite048letterTF.setEditable(false);
        ite048letterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ite048letterTFActionPerformed(evt);
            }
        });

        art002letterTF.setEditable(false);
        art002letterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                art002letterTFActionPerformed(evt);
            }
        });

        gen008letterTF.setEditable(false);
        gen008letterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen008letterTFActionPerformed(evt);
            }
        });

        ped026letterTF.setEditable(false);
        ped026letterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ped026letterTFActionPerformed(evt);
            }
        });

        ite399letterTF.setEditable(false);
        ite399letterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ite399letterTFActionPerformed(evt);
            }
        });

        eng213letterTF.setEditable(false);
        eng213letterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eng213letterTFActionPerformed(evt);
            }
        });

        nst022letterTF.setEditable(false);
        nst022letterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nst022letterTFActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Letter Grade");

        averageTF.setEditable(false);
        averageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageTFActionPerformed(evt);
            }
        });

        gpaTF.setEditable(false);
        gpaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaTFActionPerformed(evt);
            }
        });

        average.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        average.setText("AVERAGE");

        gpa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gpa.setText("GPA");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ite048TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ite048letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ite186TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ite186letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(art002TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(art002letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(average)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(gen008TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gen008letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(eng213TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(eng213letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nst022TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nst022letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ped026TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ite399TF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ped026letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ite399letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(averageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gpa))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10))
                            .addComponent(jLabel1))))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ite186TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ite186letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ite048TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ite048letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(art002TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(art002letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(average))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(gen008TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gen008letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(averageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ped026TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ped026letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ite399TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ite399letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eng213TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(eng213letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nst022TF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(nst022letterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(gpa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void ite186TFActionPerformed(java.awt.event.ActionEvent evt) {                                         
  
    }                                        

    private void ped026TFActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void nst022TFActionPerformed(java.awt.event.ActionEvent evt) {                                         
 
    }                                        

    private void ite186letterTFActionPerformed(java.awt.event.ActionEvent evt) {                                               
     
    }                                              

    private void ite048letterTFActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
    }                                              

    private void art002letterTFActionPerformed(java.awt.event.ActionEvent evt) {                                               
      
    }                                              

    private void gen008letterTFActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
    }                                              

    private void ped026letterTFActionPerformed(java.awt.event.ActionEvent evt) {                                               
    }                                              

    private void ite399letterTFActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    private void eng213letterTFActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
    }                                              

    private void nst022letterTFActionPerformed(java.awt.event.ActionEvent evt) {                                               
      
    }                                              

    private void averageTFActionPerformed(java.awt.event.ActionEvent evt) {                                          
     
    }                                         

    private void gpaTFActionPerformed(java.awt.event.ActionEvent evt) {                                      
      
    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Calculates all the grades 
        
        String ite186Score, ite048Score, art002Score, gen008Score, ped026Score, ite399Score, eng213Score, nst022Score;
        double average;
        double gpa = 0;

        ite186Score = ite186TF.getText ();    
        ite048Score = ite048TF.getText ();
        art002Score = art002TF.getText ();
        gen008Score = gen008TF.getText ();
        ped026Score = ped026TF.getText ();
        ite399Score = ite399TF.getText ();
        eng213Score = eng213TF.getText ();
        nst022Score = nst022TF.getText ();

        double ite186 = Double.parseDouble(ite186Score);
        double ite048 = Double.parseDouble(ite048Score);
        double art002 = Double.parseDouble(art002Score);
        double gen008 = Double.parseDouble(gen008Score);
        double ped026 = Double.parseDouble(ped026Score);
        double ite399 = Double.parseDouble(ite399Score);
        double eng213 = Double.parseDouble(eng213Score);
        double nst022 = Double.parseDouble(nst022Score);

        average = ((ite186 + ite048 + art002 + gen008 + ped026 + ite399 + eng213 + nst022) / 8);
        
        if (ite186 >= 90) {
            ite186letterTF.setText("A");
            gpa = gpa + 1.0;
        }else if (ite186 >= 80 && ite186 < 90 ){
            ite186letterTF.setText("B");
            gpa = gpa + 1.50;
        }else if (ite186 >= 70 && ite186 < 80 ){
            ite186letterTF.setText("C");
            gpa = gpa + 2.0;
        }else if (ite186 >= 60 && ite186 < 70 ){
            ite186letterTF.setText("D");
            gpa = gpa + 3.0;
        }else {
            ite186letterTF.setText("F");
            gpa = gpa + 5.0;
        }
        
        if (ite048 >= 90) {
            ite048letterTF.setText("A");
            gpa = gpa + 1.0;
        }else if (ite048 >= 80 && ite048 < 90 ){
            ite048letterTF.setText("B");
            gpa = gpa + 1.50;
        }else if (ite048 >= 70 && ite048 < 80 ){
            ite048letterTF.setText("C");
            gpa = gpa + 2.0;
        }else if (ite048 >= 60 && ite048 < 70 ){
            ite048letterTF.setText("D");
            gpa = gpa + 3.0;
        }else {
            ite048letterTF.setText("F");
            gpa = gpa + 5.0;
        }
        
        if (art002 >= 90) {
            art002letterTF.setText("A");
            gpa = gpa + 1.0;
        }else if (art002 >= 80 && art002 < 90 ){
            art002letterTF.setText("B");
            gpa = gpa + 1.50;
        }else if (art002 >= 70 && art002 < 80 ){
            art002letterTF.setText("C");
            gpa = gpa + 2.0;
        }else if (art002 >= 60 && art002 < 70 ){
            art002letterTF.setText("D");
            gpa = gpa + 3.0;
        }else {
            art002letterTF.setText("F");
            gpa = gpa + 5.0;
        }
        
        if (gen008 >= 90) {
            gen008letterTF.setText("A");
            gpa = gpa + 1.0;
        }else if (gen008 >= 80 && gen008 < 90 ){
            gen008letterTF.setText("B");
            gpa = gpa + 1.50;
        }else if (gen008 >= 70 && gen008 < 80 ){
            gen008letterTF.setText("C");
            gpa = gpa + 2.0;
        }else if (gen008 >= 60 && gen008 < 70 ){
            gen008letterTF.setText("D");
            gpa = gpa + 3.0;
        }else {
            gen008letterTF.setText("F");
            gpa = gpa + 5.0;
        }
        
        if (ped026 >= 90) {
            ped026letterTF.setText("A");
            gpa = gpa + 1.0;
        }else if (ped026 >= 80 && ped026 < 90 ){
            ped026letterTF.setText("B");
            gpa = gpa + 1.50;
        }else if (ped026 >= 70 && ped026 < 80 ){
            ped026letterTF.setText("C");
            gpa = gpa + 2.0;
        }else if (ped026 >= 60 && ped026 < 70 ){
            ped026letterTF.setText("D");
            gpa = gpa + 3.0;
        }else {
            ped026letterTF.setText("F");
            gpa = gpa + 5.0;
        }
        
        if (ite399 >= 90) {
            ite399letterTF.setText("A");
            gpa = gpa + 1.0;
        }else if (ite399 >= 80 && ite399 < 90 ){
            ite399letterTF.setText("B");
            gpa = gpa + 1.50;
        }else if (ite399 >= 70 && ite399 < 80 ){
            ite399letterTF.setText("C");
            gpa = gpa + 2.0;
        }else if (ite399 >= 60 && ite399 < 70 ){
            ite399letterTF.setText("D");
            gpa = gpa + 3.0;
        }else {
            ite399letterTF.setText("F");
            gpa = gpa + 5.0;
        }
        
        if (eng213 >= 90) {
            eng213letterTF.setText("A");
            gpa = gpa + 1.0;
        }else if (eng213 >= 80 && eng213 < 90 ){
            eng213letterTF.setText("B");
            gpa = gpa + 1.50;
        }else if (eng213 >= 70 && eng213 < 80 ){
            eng213letterTF.setText("C");
            gpa = gpa + 2.0;
        }else if (eng213 >= 60 && eng213 < 70 ){
            eng213letterTF.setText("D");
            gpa = gpa + 3.0;
        }else {
            eng213letterTF.setText("F");
            gpa = gpa + 5.0;
        }
        
        if (nst022 >= 90) {
            nst022letterTF.setText("A");
            gpa = gpa + 1.0;
        }else if (nst022 >= 80 && nst022 < 90 ){
            nst022letterTF.setText("B");
            gpa = gpa + 1.50;
        }else if (nst022 >= 70 && nst022 < 80 ){
            nst022letterTF.setText("C");
            gpa = gpa + 2.0;
        }else if (nst022 >= 60 && nst022 < 70 ){
            nst022letterTF.setText("D");
            gpa = gpa + 3.0;
        }else {
            nst022letterTF.setText("F");
            gpa = gpa + 5.0;
        }
        
        gpa = gpa / 8;
        
        gpaTF.setText(Double.toString(gpa));
        averageTF.setText(Double.toString(average));
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AutomaticGradingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutomaticGradingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutomaticGradingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutomaticGradingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutomaticGradingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration                     
    private javax.swing.JTextField art002TF;
    private javax.swing.JTextField art002letterTF;
    private javax.swing.JLabel average;
    private javax.swing.JTextField averageTF;
    private javax.swing.JTextField eng213TF;
    private javax.swing.JTextField eng213letterTF;
    private javax.swing.JTextField gen008TF;
    private javax.swing.JTextField gen008letterTF;
    private javax.swing.JLabel gpa;
    private javax.swing.JTextField gpaTF;
    private javax.swing.JTextField ite048TF;
    private javax.swing.JTextField ite048letterTF;
    private javax.swing.JTextField ite186TF;
    private javax.swing.JTextField ite186letterTF;
    private javax.swing.JTextField ite399TF;
    private javax.swing.JTextField ite399letterTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nst022TF;
    private javax.swing.JTextField nst022letterTF;
    private javax.swing.JTextField ped026TF;
    private javax.swing.JTextField ped026letterTF;
    // End of variables declaration                   
}