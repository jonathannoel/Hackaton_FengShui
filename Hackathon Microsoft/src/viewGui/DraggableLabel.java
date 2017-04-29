package viewGui;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.JLabel;

public class DraggableLabel extends JLabel implements DragGestureListener, DragSourceListener {
	 
private static final DataFlavor DATA_FLAVOUR = new DataFlavor(Icon.class, "");
 DragSource dragSource;
 
  public DraggableLabel(Icon icon) {
	  setIcon(icon);
	  dragSource = new DragSource();
	  dragSource.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY_OR_MOVE, this);
  }
 
  public void dragGestureRecognized(DragGestureEvent evt) {
	  Transferable transferable = new Transferable() {
 
		public boolean isDataFlavorSupported(DataFlavor d) {
			return d.equals(DATA_FLAVOUR);
		}
 
		public DataFlavor[] getTransferDataFlavors() {
			return new DataFlavor[] {DATA_FLAVOUR};
		}
 
		public Object getTransferData(DataFlavor arg0) throws UnsupportedFlavorException, IOException {
			return null;
		}
	};
	  dragSource.startDrag(evt, DragSource.DefaultCopyDrop, transferable, this);
  }
  public void dragEnter(DragSourceDragEvent evt) {
	  System.out.println("Drag enter");
  }
 
  public void dragOver(DragSourceDragEvent evt) {
	  System.out.println("Drag over");
  }
 
  public void dragExit(DragSourceEvent evt) {
	  System.out.println("Drag exit");
  }
 
  public void dropActionChanged(DragSourceDragEvent evt) {
	  System.out.println("Drag action changed");
  }
 
  public void dragDropEnd(DragSourceDropEvent evt) {
	  System.out.println("Drag action End");
  }
}