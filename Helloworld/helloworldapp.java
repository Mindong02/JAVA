//public class helloworldapp{ //파일명과 같은 애를 찾고 
//	public static void main(String[] args) { //main 문의 아래에 있는 애를 실행시킴
//		System.out.println("Hello java!");
//	}
//}
//// source = 원천
//// code = 코드, language = 언어 / app = 실행결과 = program 

// 예시 1
//import javax.swing.*;   
//import java.awt.Dimension;
//import java.awt.Toolkit;
//public class helloworldapp{
//    public static void main(String[] args){
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                JFrame frame = new JFrame("HelloWorld GUI");
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setPreferredSize(new Dimension(800, 300));
//                JLabel label = new JLabel("Hello!! world", SwingConstants.CENTER);
//                frame.getContentPane().add(label);
//                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//                frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);
//
//                frame.pack();
//                frame.setVisible(true);
//            }
//        });
//    }
//}