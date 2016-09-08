/* Copyright (C) 2006 by Peter Eastman

   This program is free software; you can redistribute it and/or modify it under the
   terms of the GNU General Public License as published by the Free Software
   Foundation; either version 2 of the License, or (at your option) any later version.

   This program is distributed in the hope that it will be useful, but WITHOUT ANY 
   WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
   PARTICULAR PURPOSE.  See the GNU General Public License for more details. */

package artofillusion.keystroke;

/**
 * This class contains information about a keyboard shortcut which automates some operation.
 * A keystroke pairs a key description (key code and modifier) with a Beanshell script to execute
 * when the key is pressed.
 */

public class KeystrokeRecord
{
  private int keyCode;
  private int modifiers;
  private String name;
  private String script;

  /**
   * Create a new KeystrokeRecord.
   *
   * @param keyCode   the key code (as defined by KeyEvent) for the key which activates this keystroke
   * @param modifiers the modifier keys which must be held down to activate this keystroke
   * @param name      a name to identify this keystroke
   * @param script    a Beanshell script to execute when the keystroke is activated
   */

  public KeystrokeRecord(int keyCode, int modifiers, String name, String script)
  {
    this.keyCode = keyCode;
    this.modifiers = modifiers;
    this.name = name;
    this.script = script;
  }

  public int getKeyCode()
  {
    return keyCode;
  }

  public void setKeyCode(int keyCode)
  {
    this.keyCode = keyCode;
  }

  public int getModifiers()
  {
    return modifiers;
  }

  public void setModifiers(int modifiers)
  {
    this.modifiers = modifiers;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getScript()
  {
    return script;
  }

  public void setScript(String script)
  {
    this.script = script;
  }

  /**
   * Create an exact duplicate of this record.
   */

  public KeystrokeRecord duplicate()
  {
    return new KeystrokeRecord(keyCode, modifiers, name, script);
  }
}
