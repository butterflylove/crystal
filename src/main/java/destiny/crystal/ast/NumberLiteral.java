package destiny.crystal.ast;

import destiny.crystal.core.Token;

public class NumberLiteral extends ASTLeaf {
    public NumberLiteral(Token token) {
        super(token);
    }

    public int value() {
        return token().getNumber();
    }
}
