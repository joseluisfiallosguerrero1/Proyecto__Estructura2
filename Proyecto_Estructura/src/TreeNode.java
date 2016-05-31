
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
public class TreeNode {

    Object value;
    TreeNode parent;
    Lista hijos;

    public TreeNode() {
        hijos = new Lista();
    }

    public TreeNode(Object value) {
        hijos = new Lista();
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public TreeNode getParent() {
        return parent;
    }

    public Lista getHijos() {
        return hijos;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void addSon(Object son) {
        TreeNode hijo = new TreeNode(son);
        hijo.setParent(this);
        this.getHijos().push(hijo);
    }

    public TreeNode getLefterSon() {
        return (TreeNode) this.getHijos().get(0);
    }

    public TreeNode getRightBrother() {
        TreeNode retorno = new TreeNode();
        int position = parent.getHijos().find(this);
        if (this.hasRightBrother() == true) {
            retorno = (TreeNode) this.parent.getHijos().get(position + 1);
        }

        return retorno;
    }

    public boolean isParent() {
        boolean retorno;
        if (this.getHijos().getSize() > 0) {
            retorno = true;
        } else {
            retorno = false;
        }

        return retorno;
    }

    public boolean hasRightBrother() {
        boolean retorno = false;
        int position;

        if (this.getParent() != null) {
            position = this.getParent().getHijos().find(this);
            if (this.getParent().getHijos().getSize() == 1) {
                retorno = false;
            } else if (this.getParent().getHijos().getSize() > position + 1) {
                retorno = true;
            }
        }
        return retorno;
    }

    public Lista getPath() {
        Lista retorno = new Lista();
        TreeNode nodo = new TreeNode();

        nodo = this;

        while (nodo.parent != null) {
            retorno.push(nodo);
            nodo = nodo.getParent();
        }
        return retorno;
    }

    public void recorrer(JTextArea area) {
        area.append( ((mapa) this.getValue()).getJugada().toString() + "\n");
        if (this.isParent()) {
            for (int i = 0; i < this.getHijos().getSize(); i++) {
                ((TreeNode) this.getHijos().get(i)).recorrer(area);
            }
        }
    }
}
