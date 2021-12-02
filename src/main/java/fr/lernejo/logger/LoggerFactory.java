package fr.lernejo.logger;
import java.util.function.Predicate;


public class LoggerFactory {
    public static Logger getLogger(String name) {
        return new CompositeLogger(new ContextualLogger(name, new FileLogger("logs.txt")), new ContextualLogger(name, new ConsoleLogger()));
    }
}
