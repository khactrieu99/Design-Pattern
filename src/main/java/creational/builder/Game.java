package creational.builder;

/**
 * @author trieutk
 */
public class Game {
    private final String name;
    private final int ageRestriction;
    private final boolean useMaxSetting;
    private final boolean useGPU;
    private final boolean useKeyboard;

    public Game(String name, int ageRestriction, boolean useMaxSetting, boolean useGPU, boolean useKeyboard) {
        this.name = name;
        this.ageRestriction = ageRestriction;
        this.useMaxSetting = useMaxSetting;
        this.useGPU = useGPU;
        this.useKeyboard = useKeyboard;
    }

    public static class GameBuilder {
        private String name;
        private int ageRestriction;
        private boolean useMaxSetting;
        private boolean useGPU;
        private boolean useKeyboard;

        public GameBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public GameBuilder restrictTheAge(int age) {
            this.ageRestriction = age;
            return this;
        }

        public GameBuilder playWithMaxSetting(boolean useMaxSetting) {
            this.useMaxSetting = useMaxSetting;
            return this;
        }

        public GameBuilder playWithGPU(boolean useGPU) {
            this.useGPU = useGPU;
            return this;
        }

        public GameBuilder playWithKeyboard(boolean useKeyboard) {
            this.useKeyboard = useKeyboard;
            return this;
        }

        public Game build() {
            return new Game(name, ageRestriction, useMaxSetting, useGPU, useKeyboard);
        }
    }
}
