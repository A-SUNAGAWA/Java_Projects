package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class RimModStringTrance {

    public static void main(String args[]) {


        String para2 = null;
        String para3 = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("置換前の文字列:");
            para2 = br.readLine();
            System.out.print("置換後の文字列:");
            para3 = br.readLine();
        }catch(IOException ex){
            System.out.println("入力エラー:" + ex.getMessage());
        }

        // Fileクラスをインスタンス化
        File file = new File("C:\\Users\\user\\Desktop\\data.txt");

        // ファイルが存在するかどうかを判定
        if ( !file.exists() ) {
            // ファイルが存在しない場合は処理終了
            System.out.println( "ファイルが存在しない" );
            return;
        }

        // 指定されたパスがファイルかどうかを判定
        if ( !file.isFile() ) {
            // ディレクトリを指定した場合は処理終了
            System.out.println( "ファイル以外を指定" );
            return;
        }

        // ファイルが読み込み可能かどうかを判定
        if ( !file.canRead() ) {
            // ファイルが読み込み不可の場合は処理終了
            System.out.println("ファイルが読み込み不可");
            return;
        }

        // ファイルが書き込み可能かどうかを判定
        if ( !file.canWrite() ) {
            // ファイルが読み込み不可の場合は処理終了
            System.out.println("ファイルが読み込み不可");
            return;
        }


        String readText = fileRead( file);

        String replaceText = readText.replaceAll(para2,para3);

        fileWrite( file, replaceText );

    }

    private static String fileRead(File _file) {

        StringBuffer fileRead = new StringBuffer("");

        try {

            // FileReaderクラスをインスタンス化
            FileReader fr = new FileReader( _file );

            // BufferedReaderクラスをインスタンス化
            BufferedReader br = new BufferedReader( fr );

            String str = null;



            str = br.readLine();

            fileRead.append(str + "\r\n");


            // ファイルを閉じる
            br.close();

        } catch ( FileNotFoundException ex ) {
             System.out.println( ex );
        } catch ( IOException ex ) {
             System.out.println( ex );
        }
        return fileRead.toString();
    }

    private static void fileWrite(File _file, String _text){

        try {

            // FileWriterクラスをインスタンス化
            FileWriter filewriter = new FileWriter( _file );

            filewriter.write( _text );

            // ファイルを閉じる
            filewriter.close();

        } catch ( IOException ex ) {
             System.out.println( ex );
        }
    }

}
