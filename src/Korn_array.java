import java.awt.Component;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Korn_array {
	private ArrayList<Korn> korn_array;
	private String name;
	private String vægt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Korn_array window = new Korn_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Korn_array(){
		korn_array = new ArrayList<Korn>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("korn.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				vægt = null;
				name = st.nextToken();
				vægt = st.nextToken();
				korn_array.add(new Korn(name, vægt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	public int getSize() {
		return korn_array.size();
	}

	public Korn getObject(int i) {
		return korn_array.get(i);
	}
}



