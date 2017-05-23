package com.heiha.game.unknown.character;

import java.io.Serializable;

/**
 * <br>
 * <b>Project:</b> unknown<br>
 * <b>Date:</b> 2017/5/23 15:01<br>
 * <b>Author:</b> heiha<br>
 */
public abstract class BaseCharacter implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
