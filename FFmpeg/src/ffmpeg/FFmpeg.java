package ffmpeg;

public class FFmpeg extends javax.swing.JFrame {

    //declaración de variables 
    private javax.swing.JButton convert;
    private javax.swing.JComboBox<String> jcbFormatSelect;
    private javax.swing.JComboBox<String> jcbRotateSelect;
    private javax.swing.JComboBox<String> jcbScreenSelect;
    private javax.swing.JLabel jlEntrance;
    private javax.swing.JLabel jlExit;
    private javax.swing.JLabel jlFormat;
    private javax.swing.JLabel jlProgram;
    private javax.swing.JLabel jlRotate;
    private javax.swing.JLabel jlScreen;
    private javax.swing.JLabel jlText1;
    private javax.swing.JLabel jlText2;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JTextField jtEntrancePath;
    private javax.swing.JTextField jtExitName;
    private javax.swing.JTextField jtProgramPath;
    private javax.swing.JButton reset;
    private javax.swing.JButton rotate;
    private javax.swing.JButton screen;

    //metodo constructor que inicia la ventana
    public FFmpeg() {
        initComponents();
    }

    private void initComponents() {

        //instancia de objetos
        jlTitle = new javax.swing.JLabel();
        jlEntrance = new javax.swing.JLabel();
        jtEntrancePath = new javax.swing.JTextField();
        jlExit = new javax.swing.JLabel();
        jtExitName = new javax.swing.JTextField();
        convert = new javax.swing.JButton();
        jcbFormatSelect = new javax.swing.JComboBox<>();
        jlFormat = new javax.swing.JLabel();
        jlText1 = new javax.swing.JLabel();
        jlText2 = new javax.swing.JLabel();
        jlProgram = new javax.swing.JLabel();
        jtProgramPath = new javax.swing.JTextField();
        jlRotate = new javax.swing.JLabel();
        jcbRotateSelect = new javax.swing.JComboBox<>();
        jlScreen = new javax.swing.JLabel();
        jcbScreenSelect = new javax.swing.JComboBox<>();
        rotate = new javax.swing.JButton();
        screen = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        //al pular X cerrar la ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //seter texto de los objetos
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\claud\\Documents\\NetBeansProjects\\ws_disenio_interfaces\\practice3\\FFmpeg\\img\\FFmpeg_Logosmall.png")); // NOI18N
        jlText1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlText1.setText("Con esta herramienta podrás convertir entre formatos de video,");
        jlText2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlText2.setText("rotar y reducir resolución.");
        jlProgram.setText("Introduce la ruta de la aplicación FFmpeg:");
        jtProgramPath.setText("C:\\ffmpeg\\bin\\ffmpeg.exe");
        jlEntrance.setText("Introduce la ruta del video que quieres convertir:");
        jtEntrancePath.setText("C:\\");
        jlExit.setText("Introduce el nombre del video de salida:");
        jlFormat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlFormat.setText("Selecciona el formato de salida del video:");
        jcbFormatSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"avi", "mp4", "mkv", "mov", "mpeg"}));
        jlRotate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlRotate.setText("Rotar imagen:");
        jcbRotateSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"┘ rotar izquierda", "└ rotar derecha"}));
        jlScreen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlScreen.setText("Cambiar resolución:");
        jcbScreenSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1280x720 (720p)", "640x480 (4:3)", "720x480 (DVD)"}));
        convert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        convert.setText("Convertir formato");
        rotate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rotate.setText("Rotar imagen");
        screen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        screen.setText("Cambiar resolución");
        reset.setText("Limpiar campos");

        //listener sobre los botones
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecute(evt);
            }
        });
        rotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotateActionPerformed(evt);
            }
        });
        screen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                screenActionPerformed(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
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
                                        .addComponent(jlText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtEntrancePath)
                                        .addComponent(jlExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlEntrance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtExitName)
                                        .addComponent(jlProgram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtProgramPath)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jcbScreenSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jlRotate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jlFormat, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jcbFormatSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jcbRotateSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(convert)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(rotate)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(screen))
                                                        .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlTitle)
                                                .addGap(12, 12, 12)
                                                .addComponent(jlText1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlText2)
                                                .addGap(18, 18, 18)
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
                                                .addComponent(jtExitName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlFormat)
                                                        .addComponent(jcbFormatSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jcbRotateSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jlRotate))
                                                .addGap(34, 34, 34))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jcbScreenSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jlScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(convert)
                                        .addComponent(rotate)
                                        .addComponent(screen))
                                .addGap(40, 40, 40)
                                .addComponent(reset)
                                .addGap(15, 15, 15))
        );

        pack();
    }

    //accion al pulsar el boton convertir
    private void jButtonExecute(java.awt.event.ActionEvent evt) {
        //variables parametrizadas
        String program = jtProgramPath.getText();
        String entrance = jtEntrancePath.getText();
        String videoName = jtExitName.getText();
        String format = jcbFormatSelect.getSelectedItem().toString();

        //localizar la ruta del video de entrada: 
        //dividirla en partes y luego juntarlas excepto la última que corresponde al fichero
        String[] parts = entrance.split("\\\\");
        String filePath = "";
        for (int i = 0; i < parts.length - 1; i++) {
            filePath += parts[i];
            if (i < parts.length - 2) {
                filePath += "\\";
            }
        }

        //sumar la ruta de la carpeta, el nombre del video y la extensión
        String exit = filePath + "\\" + videoName + "." + format;

        //para obtener el comando de conversión, concatenar programa, -i, ruta entrada, ruta salida
        String comando = program.replace("\\", "\\\\") + " -i " + entrance.replace("\\", "\\\\") + " " + exit.replace("\\", "\\\\");

        try {
            ProcessBuilder process = new ProcessBuilder("cmd.exe", "/C", comando);
            Process myprocess = process.start();
            System.out.println("Ejecutando: " + comando);
            System.out.println("ok");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //boton rotar imagen
    private void rotateActionPerformed(java.awt.event.ActionEvent evt) {
        //variables parametrizadas
        String program = jtProgramPath.getText();
        String entrance = jtEntrancePath.getText();
        String videoName = jtExitName.getText();
        String format = jcbFormatSelect.getSelectedItem().toString();
        String rotate = jcbRotateSelect.getSelectedItem().toString();
        String rotateCom = "";

        //localizar la ruta del video de entrada: 
        //dividirla en partes y luego juntarlas excepto la última que corresponde al fichero
        String[] parts = entrance.split("\\\\");
        String filePath = "";
        for (int i = 0; i < parts.length - 1; i++) {
            filePath += parts[i];
            if (i < parts.length - 2) {
                filePath += "\\";
            }
        }

        //sumar la ruta de la carpeta, el nombre del video y la extensión
        String exit = filePath + "\\" + videoName + "." + format;

        //"transpose=1" 90 grados en sentido de las agujas del reloj
        //"transpose=2" 90 grados en sentido contrario
        if (rotate.equalsIgnoreCase("┘ rotar izquierda")) {
            rotateCom = "transpose=2";
        } else {
            rotateCom = "transpose=1";
        }

        ////ffmpeg -i entrada.jpg -vf "transpose=2" salida.jpg
        //concatenamos para obtener el comando
        String comando = program.replace("\\", "\\\\") + " -i " + entrance.replace("\\", "\\\\") + " -vf " + rotateCom + " " + exit.replace("\\", "\\\\");

        try {
            ProcessBuilder process = new ProcessBuilder("cmd.exe", "/C", comando);
            Process myprocess = process.start();
            System.out.println("Ejecutando: " + comando);
            System.out.println("ok");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //boton cambiar resolucion
    private void screenActionPerformed(java.awt.event.ActionEvent evt) {
        //variables parametrizadas
        String program = jtProgramPath.getText();
        String entrance = jtEntrancePath.getText();
        String videoName = jtExitName.getText();
        String format = jcbFormatSelect.getSelectedItem().toString();
        String screen = jcbScreenSelect.getSelectedItem().toString();
        String screenCom = "";

        //localizar la ruta del video de entrada: 
        //dividirla en partes y luego juntarlas excepto la última que corresponde al fichero
        String[] parts = entrance.split("\\\\");
        String filePath = "";
        for (int i = 0; i < parts.length - 1; i++) {
            filePath += parts[i];
            if (i < parts.length - 2) {
                filePath += "\\";
            }
        }

        //sumar la ruta de la carpeta, el nombre del video y la extensión
        String exit = filePath + "\\" + videoName + "." + format;

        if (screen.equalsIgnoreCase("1280x720 (720p)")) {
            screenCom = "scale=1280:720";
        } else if (screen.equalsIgnoreCase("640x480 (4:3)")) {
            screenCom = "scale=640:480";
        } else {
            screenCom = "scale=720:480";
        }

        //ffmpeg -i entrada.mp4 -vf "scale=1280:720" -c:a copy salida.mp4
        //concatenamos para obtener el comando
        String comando = program.replace("\\", "\\\\") + " -i " + entrance.replace("\\", "\\\\") + " -vf " + screenCom + " " + exit.replace("\\", "\\\\");

        try {
            ProcessBuilder process = new ProcessBuilder("cmd.exe", "/C", comando);
            Process myprocess = process.start();
            System.out.println("Ejecutando: " + comando);
            System.out.println("ok");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //boton de limpiar campos
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        jtProgramPath.setText("C:\\ffmpeg\\bin\\ffmpeg.exe");
        jtEntrancePath.setText("C:\\");
        jtExitName.setText("");

        jcbFormatSelect.setSelectedIndex(0);
        jcbRotateSelect.setSelectedIndex(0);
        jcbScreenSelect.setSelectedIndex(0);
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
