import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c5c44043-12b8-4cab-8150-8f36ad39adda")
public class Class {
    @mdl.prop
    @objid ("1ada71b9-89a3-47b5-93cb-cd7f27417475")
    private String Attribute;

    @mdl.propsetter
    public void setAttribute(String value) {
        // Automatically generated method. Please do not modify this code.
        this.Attribute = value;
    }

    @mdl.propgetter
    public String getAttribute() {
        // Automatically generated method. Please do not modify this code.
        return this.Attribute;
    }

}
