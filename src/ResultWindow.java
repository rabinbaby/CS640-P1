import javax.swing.JFrame;
import javax.swing.SwingWorker;

/**
 *
 * @author  
 */
public class ResultWindow extends JFrame {
	private static final long serialVersionUID = 7634479643323861331L;
	private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea output;   
    
    /** Creates new form NewJFrame */
    public ResultWindow() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        output.setColumns(20);
        output.setRows(5);
        jScrollPane2.setViewportView(output);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGap(34, 34, 34))
        );

        pack();
    }
    
    SwingWorker worker = new SwingWorker<String,Void>() {
    	int i=0;	 
    	
    	//This method automatically gets executed in a background thread
    	public String doInBackground() {
    		// System.out.println("worker");
    		try {
    			output.setText("connection");
    			output.append("\n");
    			
    			while(i<10)
    			{
    				output.append("testing");	
    				output.append("\n");
    				i++;
    			}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
      		   
      		   	return null;
      	   }
      	 
    		//This methods automatically gets executed in the EDT
      	   	public void done() {
      		 

      	   	}
    };
    
    public void updateText(String text)
	   	{
	   		output.append(text + "\n");
	   	}
}