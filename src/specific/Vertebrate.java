package specific;

import java.lang.annotation.Inherited;

@Inherited
public @interface Vertebrate {
}

@Vertebrate
class Mammal {
}

class Dolphin extends Mammal {
}
