package com.psh10066.code.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 *
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    // private 생성자의 존재 때문에 상속이 불가능하다. (private으로 선언하지 않아도 되긴 하지만.)
    private Settings() {
    }

    // 생성자는 생성을 위한 목적이 정해져 있어 javadoc 문서화가 쉽고, 찾기 쉽다.
    public Settings(boolean useAutoSteering, boolean useABS, Difficulty difficulty) {
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.difficulty = difficulty;
    }

    private static final Settings SETTINGS = new Settings();

    // 네이밍 패턴을 잘 적용하여 찾기 쉽도록 하거나, 문서화를 잘 하는 것이 좋다. (클래스 최상단 참조)
    public static Settings getInstance() {
        return SETTINGS;
    }
}
