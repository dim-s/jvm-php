--TEST--
Class private constant visibility
--FILE--
<?php
class A {
    private const privateConst = 'privateConst';
    static function staticConstDump() {
        var_dump(self::privateConst);
    }
    function constDump() {
        var_dump(self::privateConst);
    }
}
A::staticConstDump();
(new A())->constDump();
constant('A::privateConst');
?>
--EXPECTF--
string(12) "privateConst"
string(12) "privateConst"

Fatal error: Cannot access private constant A::privateConst in %s on line 13, position %d