package ffmpeg;

public class FFmpeg extends javax.swing.JFrame {

    //declaración de variables 
    private javax.swing.JButton convert;
    private javax.swing.JLabel jlProgram;
    private javax.swing.JLabel jlEntrance;
    private javax.swing.JLabel jlExit;
    private javax.swing.JLabel jlFormat;
    private javax.swing.JTextField jtProgramPath;
    private javax.swing.JTextField jtEntrancePath;
    private javax.swing.JTextField jtExitPath;
    private javax.swing.JComboBox<String> jcbFormatSelect;

    //metodo constructor que inicia la ventana
    public FFmpeg() {
        initComponents();
    }

    private void initComponents() {

        //instancia de objetos
        jlProgram = new javax.swing.JLabel();
        jtProgramPath = new javax.swing.JTextField();
        jlEntrance = new javax.swing.JLabel();
        jtEntrancePath = new javax.swing.JTextField();
        jlExit = new javax.swing.JLabel();
        jtExitPath = new javax.swing.JTextField();
        convert = new javax.swing.JButton();
        jcbFormatSelect = new javax.swing.JComboBox<>();
        jlFormat = new javax.swing.JLabel();

        //al pular X cerrar la ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //seter texto de los objetos
        jlProgram.setText("Introduce la ruta del programa:");
        jlEntrance.setText("Introduce la ruta del video de origen:");
        jlExit.setText("Introduce la ruta y nombre del video de salida:");
        convert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        convert.setText("Convertir");
        jcbFormatSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"avi", "mp4", "mkv", "mov", "mpeg"}));
        jlFormat.setText("Selecciona el formato de salida:");

        //listener
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecute(evt);
            }
        });

        //creacion de un layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        //ubicacion del layout dentro de la ventana
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtEntrancePath)
                                        .addComponent(jlExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlEntrance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtExitPath)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlFormat, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jcbFormatSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtProgramPath))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(convert)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlProgram)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtProgramPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlEntrance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtEntrancePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlExit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtExitPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jcbFormatSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlFormat))
                                .addGap(38, 38, 38)
                                .addComponent(convert)
                                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }

    //accion al pulsar el boton Ejecutar
    private void jButtonExecute(java.awt.event.ActionEvent evt) {
        //variables parametrizadas
        String program = jtProgramPath.getText();
        String entrance = jtEntrancePath.getText();
        String exit = jtExitPath.getText();

        String comando = program + " -i " + entrance + " " + exit;

        try {
            ProcessBuilder process = new ProcessBuilder("cmd.exe", "/C", comando);
            Process myprocess = process.start();
            System.out.println("Ejecutando: " + comando);
            System.out.println("ok");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //look and feel Nimbus
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FFmpeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FFmpeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FFmpeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FFmpeg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //ejecutar la ventana
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FFmpeg().setVisible(true);
            }
        });
    }
}
