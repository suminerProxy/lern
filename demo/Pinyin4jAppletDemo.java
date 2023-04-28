package demo;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
public class Pinyin4jAppletDemo extends JApplet {
    private static final Dimension APP_SIZE = null;
    private static String appName = null;
    private static final long serialVersionUID = -1934962385592030162L;
    private JPanel buttonPanel;
    public String[] caseTypes;
    private JComboBox caseTypesComboBox;
    private JLabel charLabel;
    private JTextField charTextField;
    private JButton convertButton;
    private JPanel formattedCharPanel;
    private JTextArea formattedOutputField;
    private JPanel jContentPane;
    private JTabbedPane jTabbedPane;
    private JPanel optionPanel;
    private JLabel toneLabel;
    public String[] toneTypes;
    private JComboBox toneTypesComboBox;
    private JPanel unformattedCharPanel;
    private JLabel unformattedGwoyeuRomatzyhLabel;
    private JPanel unformattedGwoyeuRomatzyhPanel;
    private JScrollPane unformattedGwoyeuRomatzyhScrollPane;
    private JTextArea unformattedGwoyeuRomatzyhTextArea;
    private JLabel unformattedHanyuPinyinLabel;
    private JPanel unformattedHanyuPinyinPanel;
    private JScrollPane unformattedHanyuPinyinScrollPane;
    private JTextArea unformattedHanyuPinyinTextArea;
    private JLabel unformattedMPS2PinyinLabel;
    private JPanel unformattedMPS2PinyinPanel;
    private JScrollPane unformattedMPS2PinyinScrollPane;
    private JTextArea unformattedMPS2PinyinTextArea;
    private JLabel unformattedTongyongPinyinLabel;
    private JPanel unformattedTongyongPinyinPanel;
    private JScrollPane unformattedTongyongPinyinScrollPane;
    private JTextArea unformattedTongyongPinyinTextArea;
    private JLabel unformattedWadePinyinLabel;
    private JPanel unformattedWadePinyinPanel;
    private JScrollPane unformattedWadePinyinScrollPane;
    private JTextArea unformattedWadePinyinTextArea;
    private JLabel unformattedYalePinyinLabel;
    private JPanel unformattedYalePinyinPanel;
    private JScrollPane unformattedYalePinyinScrollPane;
    private JTextArea unformattedYalePinyinTextArea;
    public String[] vCharTypes;
    private JComboBox vCharTypesComboBox;

    /* renamed from: demo.Pinyin4jAppletDemo$1  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass1 extends WindowAdapter {
        private final /* synthetic */ Pinyin4jAppletDemo val$appletDemo;

        public AnonymousClass1(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        }

        public void windowClosing(WindowEvent windowEvent) {
        }
    }

    /* renamed from: demo.Pinyin4jAppletDemo$2  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass2 implements ActionListener {
        private final /* synthetic */ Pinyin4jAppletDemo this$0;

        public AnonymousClass2(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        }

        private String concatPinyinStringArray(String[] strArr) {
        }

        private void updateFormattedTextField(char c, String str, String str2, String str3) {
        }

        private void updateUnformattedTextField(char c) {
        }

        public void actionPerformed(ActionEvent actionEvent) {
        }
    }

    /* renamed from: demo.Pinyin4jAppletDemo$3  reason: invalid class name */
    /* loaded from: C:\Users\baby\Nox_share\ImageShare\dex\_data_user_0_com.showstartfans.activity_files_prodexdir_00O000ll111l_3.dex_8745732.dex */
    public final class AnonymousClass3 implements ActionListener {
        private final /* synthetic */ Pinyin4jAppletDemo this$0;

        public AnonymousClass3(Pinyin4jAppletDemo pinyin4jAppletDemo) {
        }

        public void actionPerformed(ActionEvent actionEvent) {
        }
    }

    public static /* synthetic */ String access$000(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JComboBox access$100(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JTextArea access$1000(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JComboBox access$200(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JComboBox access$300(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JTextArea access$400(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JTextArea access$500(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JTextArea access$600(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JTextArea access$700(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JTextArea access$800(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    public static /* synthetic */ JTextArea access$900(Pinyin4jAppletDemo pinyin4jAppletDemo) {
    }

    private JPanel getButtonPanel() {
    }

    private JComboBox getCaseTypesComboBox() {
    }

    private JTextField getCharTextField() {
    }

    private String getChineseCharText() {
    }

    private JButton getConvertButton() {
    }

    private JPanel getFormattedCharPanel() {
    }

    private JTextArea getFormattedOutputField() {
    }

    private JPanel getJContentPane() {
    }

    private JTabbedPane getJTabbedPane() {
    }

    private JPanel getOptionPanel() {
    }

    private JComboBox getToneTypesComboBox() {
    }

    private JPanel getUnformattedCharPanel() {
    }

    private JPanel getUnformattedGwoyeuRomatzyhPanel() {
    }

    private JScrollPane getUnformattedGwoyeuRomatzyhScrollPane() {
    }

    private JTextArea getUnformattedGwoyeuRomatzyhTextArea() {
    }

    private JPanel getUnformattedHanyuPinyinPanel() {
    }

    private JScrollPane getUnformattedHanyuPinyinScrollPane() {
    }

    private JTextArea getUnformattedHanyuPinyinTextArea() {
    }

    private JPanel getUnformattedMPS2PinyinPanel() {
    }

    private JScrollPane getUnformattedMPS2PinyinScrollPane() {
    }

    private JTextArea getUnformattedMPS2PinyinTextArea() {
    }

    private JPanel getUnformattedTongyongPinyinPanel() {
    }

    private JScrollPane getUnformattedTongyongPinyinScrollPane() {
    }

    private JTextArea getUnformattedTongyongPinyinTextArea() {
    }

    private JPanel getUnformattedWadePinyinPanel() {
    }

    private JScrollPane getUnformattedWadePinyinScrollPane() {
    }

    private JTextArea getUnformattedWadePinyinTextArea() {
    }

    private JPanel getUnformattedYalePinyinPanel() {
    }

    private JScrollPane getUnformattedYalePinyinScrollPane() {
    }

    private JTextArea getUnformattedYalePinyinTextArea() {
    }

    private JComboBox getVCharTypesComboBox() {
    }

    public static void main(String[] strArr) {
    }

    public void init() {
    }
}
