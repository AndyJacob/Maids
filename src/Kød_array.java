import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class K�d_array {
	private ArrayList<K�d> k�d_array;
	private String name;
	private String v�gt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					K�d_array window = new K�d_array();
					window.hentlist();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public K�d_array(){
		k�d_array = new ArrayList<K�d>();
		hentlist();
	}

	public void hentlist(){
		try{
			FileInputStream fstream = null;
			fstream = new FileInputStream("k�d.data");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(strLine, ",");
				name = null;
				v�gt = null;
				name = st.nextToken();
				v�gt = st.nextToken();
				k�d_array.add(new K�d(name, v�gt));
			}
		}catch(IOException e){
			System.out.println("fejl");
		}
	}
	public K�d getObject(int i) {
		return k�d_array.get(i);
	}
	public int getSize() {
		return k�d_array.size();
	}
}



