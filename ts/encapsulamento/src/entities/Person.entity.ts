export class Person {
    private _name: string
    private _gender: string

    constructor(name: string, gender: string) {
        this._name = name;
        this._gender = gender;
    }

    public get getName() {
        return this._name;
    }

    public set setName(name: string) {
        this._name = name;
    }

    public get getGender() {
        return this._gender;
    }

    public set setGender(gender: string) {
        this._gender = gender;
    }
}