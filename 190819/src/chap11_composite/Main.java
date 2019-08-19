package chap11_composite;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			
			rootdir.printList();
			
			System.out.println("");
			System.out.println("Making user entries...");
			
			Directory Kim = new Directory("Kim");
			Directory Lee = new Directory("Lee");
			Directory Choi = new Directory("Choi");
			
			usrdir.add(Kim);
			usrdir.add(Lee);
			usrdir.add(Choi);
			
			Kim.add(new File("diary.html", 100));
			Kim.add(new File("Composite.html", 200));
			Lee.add(new File("memo.tex", 300));
			Choi.add(new File("game.doc", 400));
			Choi.add(new File("junk.mail", 500));
			rootdir.printList();
			
			
		}catch(FileTreatmentException e) {
			e.printStackTrace();
		}

	}

}
