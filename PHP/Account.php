<?php
    class Account{
        public $id, $document, $email, $password;

        public function __construct($name, $document)
        {
            $this->name = $name;
            $this->document = $document;
        }
    }
?>