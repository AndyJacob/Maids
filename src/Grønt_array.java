import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Gr�nt_array {
	private ArrayList<Gr�nt> gr�nt_array;
	private String name;
	private String v�gt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gr�nt_array window = new Gr�nt_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gr�nt_array(){
		gr�nt_array = new ArrayList<Gr�nt>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("gr�nt.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				v�gt = null;
				name = st.nextToken();
				v�gt = st.nextToken();
				gr�nt_array.add(new Gr�nt(name, v�gt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	public int getSize() {
		return gr�nt_array.size();
	}

	public Gr�nt getObject(int i) {
		return gr�nt_array.get(i);
	}
}



