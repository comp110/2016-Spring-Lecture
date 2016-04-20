package comp110.lecture26b;

/*
 * A Filter can combine multiple effects.
 */
public class Filter {

  /* Instance Variables */
  private String _name;

  private int _effectCount = 0;
  private Effect[] _effects = new Effect[50];

  /* Constructor */
  public Filter(String name) {
    _name = name;
  }

  /* Apply each effect on-top of the next. */
  public Image process(Image input) {
    Image output = input.copy();
    for (int i = 0; i < _effectCount; i++) {
      output = _effects[i].process(output);
    }
    return output;
  }

  /* Accessor Methods */

  public void setName(String name) {
    _name = name;
  }

  public void addEffect(Effect effect) {
    if (_effectCount < _effects.length) {
      _effects[_effectCount] = effect;
      _effectCount++;
    }
  }

  public Effect[] getEffects() {
    return _effects;
  }

  public String toString() {
    return _name;
  }

}