import {describe, expect, test} from '@jest/globals';
import { add } from "../src/utils";

describe("Sum module", () => {
    test("should return 3", () => {
        expect(add(1, 2)).toEqual(3);
    })
})