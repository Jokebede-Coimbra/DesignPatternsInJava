package criacional.builder.builders;

import criacional.builder.components.ColorType;

public interface ISportBuilder extends IBuilder {

    void setColor(ColorType colorType);

}
