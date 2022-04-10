import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.*;

public class OperatingFunctions {

    public String pasteTextFromClipboard() {
        String clipboardText = "";
        try {
            clipboardText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException unsupportedFlavorException) {
            unsupportedFlavorException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return clipboardText;
    }

    public void copyTextToClipboard(String text) {
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }

    public void downloadFile(String text){
        try {
            PrintWriter writer = new PrintWriter("case-converter.txt", "UTF-8");
            writer.println(text);
            writer.close();
            Runtime.getRuntime().exec("explorer.exe /select, case-converter.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
