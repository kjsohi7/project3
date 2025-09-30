package simplf; 

class Environment {
    Environment() {
        //throw new UnsupportedOperationException("TODO: implement environments.");
    }

    Environment(Environment enclosing) {
        throw new UnsupportedOperationException("TODO: implement environments.");
    }

    void define(Token varToken, String name, Object value) {
        throw new UnsupportedOperationException("TODO: implement environments.");
    }

    void assign(Token name, Object value) {
        throw new UnsupportedOperationException("TODO: implement environments.");
    }

    Object get(Token name) {
        throw new UnsupportedOperationException("TODO: implement environments.");
    }
}

