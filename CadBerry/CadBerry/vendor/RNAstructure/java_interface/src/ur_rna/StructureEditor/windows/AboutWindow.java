package ur_rna.StructureEditor.windows;

import ur_rna.StructureEditor.AppActions;
import ur_rna.StructureEditor.Program;
import ur_rna.Utilities.swing.JActionLabel;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AboutWindow extends ChildFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton btnClose;
    private JLabel lblWebsite;
    private JLabel lblHelp;
    private JLabel lblLogo;
    private JPanel pnlLogo;
    private JLabel lblVersion;
    private JLabel lblCopyright;
    private JLabel lblProgramTitle;
    private JLabel lblFeedback;
//    private JLabel lblVersion;
//    private JLabel lblCopyright;

    private void createUIComponents() {
        lblWebsite = new JActionLabel(AppActions.OPEN_WEBSITE);
        lblHelp = new JActionLabel(AppActions.SHOW_LOCAL_HELP);
        lblFeedback = new JActionLabel(AppActions.SEND_FEEDBACK);

        for (JLabel lbl : new JLabel[]{lblWebsite, lblHelp, lblFeedback})
            lbl.setIcon(null);

        // TODO: place custom component creation code here
    }

    public AboutWindow() {
        super("About " + Program.TITLE, false);
        $$$setupUI$$$();
        KeyAdapter ka = new KeyAdapter() {
            @Override
            public void keyTyped(final KeyEvent e) {
                super.keyTyped(e);
                if ((int) e.getKeyChar() == KeyEvent.VK_ESCAPE)
                    close();
            }
        };
        addKeyListener(ka);
        btnClose.addKeyListener(ka);

        BasicInternalFrameUI ui = ((BasicInternalFrameUI) this.getUI());
        ui.setNorthPane(null);
        this.setBorder(BorderFactory.createEtchedBorder());
        btnClose.addActionListener(this);
        lblProgramTitle.setText(Program.TITLE);
        lblVersion.setText(lblVersion.getText().replace("[VERSION]", Program.getVersion()));
        lblCopyright.setText(lblCopyright.getText().replace("[YEARS]", Program.C_YEAR));

//        MouseAdapter ma = new MouseAdapter() {
//            @Override
//            public void mouseClicked(final MouseEvent e) {
//                Component c = e.getComponent();
//                if (c == lblWebsite)
//                    AppActions.OPEN_WEBSITE.invoke(this);
//                else if (c == lblHelp)
//                    AppActions.SHOW_LOCAL_HELP.invoke(this);
//                else if (c == lblFeedback)
//                    AppActions.SEND_FEEDBACK.invoke(this);
//            }
//        };

//        Cursor hand = ;
//        for(JLabel lbl : new JLabel[] { lblWebsite, lblHelp, lblFeedback }) {
//            lbl.addMouseListener(ma);
//            lbl.setCursor(hand);
//        }

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = gbc.weighty = 1;
        gbc.insets = new Insets(10, 10, 10, 10);
        add(mainPanel, gbc);
        pack();

        setSize(700, getSize().height);
    }

    public void actionPerformed(final ActionEvent e) {
        switch (e.getActionCommand()) {
            case "close":
                close();
                break;
        }
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setFont(new Font(mainPanel.getFont().getName(), mainPanel.getFont().getStyle(), 12));
        mainPanel.setPreferredSize(new Dimension(600, 400));
        btnClose = new JButton();
        btnClose.setActionCommand("close");
        btnClose.setFont(new Font("Arial", btnClose.getFont().getStyle(), 14));
        btnClose.setText("OK");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 5, 0);
        mainPanel.add(btnClose, gbc);
        final JLabel label1 = new JLabel();
        label1.setFont(new Font("Arial", label1.getFont().getStyle(), 14));
        label1.setText("RNAstucture is developed by the David H. Mathews Lab at the University of Rochester.");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(10, 0, 5, 0);
        mainPanel.add(label1, gbc);
        pnlLogo = new JPanel();
        pnlLogo.setLayout(new GridBagLayout());
        pnlLogo.setBackground(new Color(-5919315));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(pnlLogo, gbc);
        lblLogo = new JLabel();
        lblLogo.setBackground(new Color(-5919315));
        lblLogo.setIcon(new ImageIcon(getClass().getResource("/ur_rna/StructureEditor/resources/images/logo-pic.png")));
        lblLogo.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.4;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(10, 0, 10, 0);
        pnlLogo.add(lblLogo, gbc);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setMinimumSize(new Dimension(300, 209));
        panel1.setOpaque(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        pnlLogo.add(panel1, gbc);
        final JLabel label2 = new JLabel();
        label2.setFocusable(false);
        label2.setFont(new Font("Bookman Old Style", Font.BOLD, 26));
        label2.setForeground(new Color(-16757760));
        label2.setText("RNAstructure");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(10, 0, 0, 0);
        panel1.add(label2, gbc);
        lblCopyright = new JLabel();
        lblCopyright.setFont(new Font("Times New Roman", Font.BOLD, 26));
        lblCopyright.setForeground(new Color(-16757760));
        lblCopyright.setText("© [YEARS]");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1;
        panel1.add(lblCopyright, gbc);
        final JLabel label3 = new JLabel();
        label3.setFont(new Font("Times New Roman", Font.BOLD, 26));
        label3.setForeground(new Color(-16757760));
        label3.setText("Mathews Lab");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(0, 0, 20, 0);
        panel1.add(label3, gbc);
        lblVersion = new JLabel();
        lblVersion.setFont(new Font("Times New Roman", Font.BOLD, 26));
        lblVersion.setForeground(new Color(-16757760));
        lblVersion.setText("Version [VERSION]");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(10, 0, 0, 0);
        panel1.add(lblVersion, gbc);
        lblProgramTitle = new JLabel();
        lblProgramTitle.setFocusable(false);
        lblProgramTitle.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
        lblProgramTitle.setForeground(new Color(-16776854));
        lblProgramTitle.setText("[PROGRAM TITLE]");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(5, 0, 0, 0);
        panel1.add(lblProgramTitle, gbc);
        final JLabel label4 = new JLabel();
        label4.setFont(new Font("Arial", label4.getFont().getStyle(), 14));
        label4.setText("The structure drawing editor was written by Richard M. Watson");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(0, 0, 10, 0);
        mainPanel.add(label4, gbc);
        lblHelp.setFont(new Font("Arial", lblHelp.getFont().getStyle(), 14));
        lblHelp.setText("<html>View <a href=\"\">Documentation and Help</a>");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.3;
        mainPanel.add(lblHelp, gbc);
        lblWebsite.setFont(new Font("Arial", lblWebsite.getFont().getStyle(), 14));
        lblWebsite.setText("<html>Go to <a href=\"\">Lab Website</a>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 0.3;
        mainPanel.add(lblWebsite, gbc);
        lblFeedback.setFont(new Font("Arial", lblFeedback.getFont().getStyle(), 14));
        lblFeedback.setText("<html>Send <a href=\"\">Feedback/Bug Report</a>");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 0.3;
        mainPanel.add(lblFeedback, gbc);
    }
    /** @noinspection ALL */
    public JComponent $$$getRootComponent$$$() { return mainPanel; }
}
