
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author manuel
 */
public class MyTree {

    TreeNode root;

    public MyTree() {
    }

    public MyTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void preOrder(TreeNode nodo, Lista retorno) {
        try {
         if (nodo == null) {
            nodo = root;
        }

        if (nodo.isParent()) {
            preOrder(nodo.getLefterSon(), retorno);
        } else if (nodo.hasRightBrother()) {
            retorno.push(nodo);
            preOrder(nodo.getRightBrother(), retorno);
        } else {
            retorno.push(nodo);
            while (nodo.hasRightBrother() == false && nodo != root) {
                if (nodo != root) {
                    nodo = nodo.getParent();
                }
            }

            if (nodo != root) {
                preOrder(nodo.getRightBrother(), retorno);
            }
        }     
        } catch (java.lang.StackOverflowError e) {
            System.out.println("nada");
        }
       

    }

    public void recorrer(JTextArea area) {
        area.setText("");
        root.recorrer(area);
    }

}
