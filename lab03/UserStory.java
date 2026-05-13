package lab03;

import java.util.Arrays;

public class UserStory extends Ticket {
    private final UserStory[] dependencies;

    public UserStory(int id, String name, int estimate, UserStory[] dependencies) {
        super(id, name, estimate);
        this.dependencies = dependencies;
    }

    public UserStory(int id, String name, int estimate) {
        this(id, name, estimate, null);
    }

    @Override
    public void complete() {
        if (dependencies != null) {
            for (UserStory dependency : dependencies) {
                if (!dependency.isCompleted()) return;
            }
        }
        super.complete();
    }

    public UserStory[] getDependencies() {
        if (dependencies == null) return new UserStory[0];
        return Arrays.copyOf(dependencies, dependencies.length);
    }

    @Override
    public String toString() {
        return String.format("[US %d] %s", getId(), getName());
    }
}