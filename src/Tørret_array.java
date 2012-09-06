import java.awt.Component;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Tørret_array {
	private ArrayList<Tørret> tørret_array;
	private String name;
	private String vægt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tørret_array window = new Tørret_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tørret_array(){
		tørret_array = new ArrayList<Tørret>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("tørret.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				vægt = null;
				name = st.nextToken();
				vægt = st.nextToken();
				tørret_array.add(new Tørret(name, vægt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	public int getSize() {
		return tørret_array.size();
	}

	public Tørret getObject(int i) {
		return tørret_array.get(i);
	}
}



