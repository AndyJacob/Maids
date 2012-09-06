import java.awt.Component;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class T�rret_array {
	private ArrayList<T�rret> t�rret_array;
	private String name;
	private String v�gt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T�rret_array window = new T�rret_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public T�rret_array(){
		t�rret_array = new ArrayList<T�rret>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("t�rret.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				v�gt = null;
				name = st.nextToken();
				v�gt = st.nextToken();
				t�rret_array.add(new T�rret(name, v�gt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	public int getSize() {
		return t�rret_array.size();
	}

	public T�rret getObject(int i) {
		return t�rret_array.get(i);
	}
}



