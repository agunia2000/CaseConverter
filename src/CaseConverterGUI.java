import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaseConverterGUI {
    private JPanel mainPanel;
    private JPanel contentPanel;
    private JPanel textPanel;
    private JLabel textLabel;
    private JScrollPane textScrollPane;
    private JTextArea textArea;
    private JPanel buttonsPanel;
    private JPanel leftButtonsPanel;
    private JButton clearButton;
    private JButton sentenceCaseButton;
    private JButton lowerCaseButton;
    private JButton copyButton;
    private JPanel rightButtonsPanel;
    private JButton pasteButton;
    private JButton titleCaseButton;
    private JButton upperCaseButton;
    private JButton downloadButton;

    private OperatingFunctions operatingFunctions = new OperatingFunctions();
    private ConvertingFunctions convertingFunctions = new ConvertingFunctions();

    public CaseConverterGUI() {
        textArea.setMargin(new Insets(10,10,10,10));

        clearButton.setFocusable(false);
        pasteButton.setFocusable(false);
        sentenceCaseButton.setFocusable(false);
        titleCaseButton.setFocusable(false);
        lowerCaseButton.setFocusable(false);
        upperCaseButton.setFocusable(false);
        copyButton.setFocusable(false);
        downloadButton.setFocusable(false);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        pasteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText() + operatingFunctions.pasteTextFromClipboard());
            }
        });

        sentenceCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(convertingFunctions.getSentenceCase(textArea.getText()));
            }
        });

        titleCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(convertingFunctions.getTitleCase(textArea.getText()));
            }
        });

        lowerCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(convertingFunctions.getLowerCase(textArea.getText()));
            }
        });

        upperCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(convertingFunctions.getUpperCase(textArea.getText()));
            }
        });

        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operatingFunctions.copyTextToClipboard(textArea.getText());
            }
        });

        downloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operatingFunctions.downloadFile(textArea.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Case Converter");
        frame.setContentPane(new CaseConverterGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(1100, 650));
        frame.setPreferredSize(new Dimension(1100, 650));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
