<?php
    class Account{
        private $id, $document, $email, $password, $name;

        public function __construct($name, $document)
        {
            $this->name = $name;
            $this->document = $document;
        }
    }
?>